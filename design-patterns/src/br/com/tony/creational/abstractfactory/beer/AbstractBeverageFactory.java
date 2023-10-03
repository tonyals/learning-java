package br.com.tony.creational.abstractfactory.beer;

import br.com.tony.creational.abstractfactory.beer.beverage.Beverage;

public interface AbstractBeverageFactory {
    Beverage getBeverage(String type);
}
