package br.com.tony.creational.factory.logisticfactory.method;

public class SeaTransportMethod implements TransportMethod {

    @Override
    public void deliver() {
        System.out.println("Sea delivery");
    }
}
