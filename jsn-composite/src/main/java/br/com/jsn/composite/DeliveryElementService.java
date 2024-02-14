package br.com.jsn.composite;

import br.com.jsn.dto.DeliveryDTO;

public class DeliveryElementService extends ProjectComponent{

    private DeliveryDTO deliveryDTO;
    
    
    public DeliveryElementService(DeliveryDTO deliveryDTO) {
        this.deliveryDTO = deliveryDTO;
    }


    @Override
    public Object display() {
        System.out.println(" Delivery " + deliveryDTO);
        return deliveryDTO;
    }
    
    
}
