package br.com.jsn.composite;

import br.com.jsn.dto.DeliveryDTO;

public class DeliveryService extends ProjectElement{

    private DeliveryDTO deliveryDTO;
    
    
    public DeliveryService(DeliveryDTO deliveryDTO) {
        this.deliveryDTO = deliveryDTO;
    }


    @Override
    public Object display() {
        System.out.println(" Delivery " + deliveryDTO);
        return deliveryDTO;
    }
    
    
}
