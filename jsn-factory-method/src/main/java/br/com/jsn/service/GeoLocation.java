package br.com.jsn.service;

import br.com.jsn.model.CoordinateModel;
import br.com.jsn.model.GeocodeModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeoLocation {


    private static final String URL_GEOCODE = "https://geocode.maps.co/search?q={address}";

    public CoordinateModel getCoord(String endereco){

        RestTemplate restTemplate = new RestTemplate();
        Map<String ,String> param = new HashMap<String ,String>();
        param.put("address",endereco);
        String result = restTemplate.getForObject(URL_GEOCODE , String.class ,param);


        ObjectMapper mapper = new ObjectMapper();
        CoordinateModel model = new CoordinateModel();
        try {

            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            List<GeocodeModel> geo = mapper.readValue(result , new TypeReference<List<GeocodeModel>>() {});

            model.setLat(Double.parseDouble(geo.get(0).getLat()));
            model.setLon(Double.parseDouble(geo.get(0).getLon()));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


    return model ;
    }


}
