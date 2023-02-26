package br.com.jsn.service;

import br.com.jsn.factory.ConcreteFactoryAndroid;
import br.com.jsn.model.AndroidModel;
import br.com.jsn.product.ConcreteProductLocation;
import br.com.jsn.product.ConcreteProductMenu;
import br.com.jsn.product.ConcreteProductWindow;
import org.springframework.stereotype.Service;


@Service
public class AndroidService {


    ConcreteFactoryAndroid cfa = new ConcreteFactoryAndroid();
    ConcreteProductWindow cpw = (ConcreteProductWindow) cfa.createWindow();
    ConcreteProductMenu cpm = (ConcreteProductMenu) cfa.createMenu();
    ConcreteProductLocation cpl = (ConcreteProductLocation) cfa.createLocation();


    public AndroidModel getService(){
        AndroidModel androidModel = new AndroidModel();
        androidModel.setWindow(cpw.action());
        androidModel.setMenu(cpm.action());
        androidModel.setLocation(cpl.action());
        return androidModel ;
    }

}
