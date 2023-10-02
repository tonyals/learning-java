package br.com.tony.creational.factory.logisticfactory.method;

public class TruckTransportMethod implements TransportMethod {
    @Override
    public void deliver() {
        System.out.println("Truck delivery");
    }
}
