package Functies;

import Regios.Regio;

import java.util.List;

public class DeliveryRoute {
     private final Regio regio;
     private final Van deliveryVan;
     private final Driver deliveryman;
     private List<Client> clientList;

    public DeliveryRoute(Regio regio, Van deliveryVan, Driver deliveryman) {
        this.regio = regio;
        this.deliveryVan = deliveryVan;
        this.deliveryman = deliveryman;
    }
}
