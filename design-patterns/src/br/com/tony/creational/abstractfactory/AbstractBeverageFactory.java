package br.com.tony.creational.abstractfactory;

import br.com.tony.creational.abstractfactory.beverage.Beverage;

public interface AbstractBeverageFactory {
    Beverage getBeverage(String type);
}
