package br.com.jsn.service;

import br.com.jsn.factory.ConcreteFactoryMac;
import br.com.jsn.model.MacModel;
import br.com.jsn.product.ConcreteProductLocation;
import br.com.jsn.product.ConcreteProductMenu;
import br.com.jsn.product.ConcreteProductWindow;
import org.springframework.stereotype.Service;


@Service
public class MacService {


    ConcreteFactoryMac cfm = new ConcreteFactoryMac();
    ConcreteProductWindow cpw2 = (ConcreteProductWindow) cfm.createWindow();
    ConcreteProductMenu cpm2 = (ConcreteProductMenu) cfm.createMenu();
    ConcreteProductLocation cpl2 = (ConcreteProductLocation) cfm.createLocation();


    public MacModel getService(){
        MacModel macModel = new MacModel();

        macModel.setWindow(cpw2.action());
        macModel.setMenu(cpm2.action());
        macModel.setLocation(cpl2.action());

        return  macModel ;
    }
}
