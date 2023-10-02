package br.com.tony.creational.factory.logisticfactory;

import br.com.tony.creational.factory.logisticfactory.factory.TransportMethodFactory;
import br.com.tony.creational.factory.logisticfactory.method.TransportMethod;

public class TransportMethodFactoryClient {
    public static void main(String[] args) {
        TransportMethod ship = TransportMethodFactory.createTransport("SHIP");
        TransportMethod truck = TransportMethodFactory.createTransport("TRUCK");
        ship.deliver();
        truck.deliver();
    }
}
