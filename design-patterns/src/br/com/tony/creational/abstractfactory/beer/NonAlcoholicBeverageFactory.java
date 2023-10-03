package br.com.tony.creational.abstractfactory.beer;

import br.com.tony.creational.abstractfactory.beer.beverage.*;

public class NonAlcoholicBeverageFactory implements AbstractBeverageFactory {
    @Override
    public Beverage getBeverage(String type) {
        System.out.println(this.getClass().getName());
        return switch (type.toUpperCase()) {
            case "JUICE" -> new Juice();
            case "WATER" -> new Water();
            default -> throw new IllegalArgumentException();
        };
    }
}
