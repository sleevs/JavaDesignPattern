package br.com.jsn.composite;

import br.com.jsn.dto.DeliveryDTO;



public class DeliveryElement extends ManagerComponent{

    private DeliveryDTO deliveryDTO;
    
    
    public DeliveryElement(DeliveryDTO deliveryDTO) {
        this.deliveryDTO = deliveryDTO;
    }


    @Override
    public Object display() {
        System.out.println(" Delivery " + deliveryDTO);
        return deliveryDTO;
    }
    
    
}
