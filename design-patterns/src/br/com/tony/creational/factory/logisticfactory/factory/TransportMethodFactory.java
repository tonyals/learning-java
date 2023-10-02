package br.com.tony.creational.factory.logisticfactory.factory;

import br.com.tony.creational.factory.logisticfactory.method.SeaTransportMethod;
import br.com.tony.creational.factory.logisticfactory.method.TransportMethod;
import br.com.tony.creational.factory.logisticfactory.method.TruckTransportMethod;

public class TransportMethodFactory {

    private TransportMethodFactory() {}
    public static TransportMethod createTransport(String type) {
        return switch (type) {
            case "SHIP" -> new SeaTransportMethod();
            case "TRUCK" -> new TruckTransportMethod();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
