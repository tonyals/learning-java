package br.com.tony.creational.abstractfactory;

public class FactoryProducer {
    public static AbstractBeverageFactory getBeverageFactory(Boolean isAlcoholic) {
        if (isAlcoholic) {
            return new AlcoholicBeverageFactory();
        }
        return new NonAlcoholicBeverageFactory();
    }
}
