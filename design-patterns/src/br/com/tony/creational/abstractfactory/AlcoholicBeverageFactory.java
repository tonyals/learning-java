package br.com.tony.creational.abstractfactory;

import br.com.tony.creational.abstractfactory.beverage.Beer;
import br.com.tony.creational.abstractfactory.beverage.Beverage;
import br.com.tony.creational.abstractfactory.beverage.Wine;

public class AlcoholicBeverageFactory implements AbstractBeverageFactory {
    @Override
    public Beverage getBeverage(String type) {
        System.out.println(this.getClass().getName());
        return switch (type.toUpperCase()) {
            case "WINE" -> new Wine();
            case "BEER" -> new Beer();
            default -> throw new IllegalArgumentException();
        };
    }
}
