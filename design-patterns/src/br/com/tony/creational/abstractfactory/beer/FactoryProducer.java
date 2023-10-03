package br.com.tony.creational.abstractfactory.beer;

public class FactoryProducer {

    private FactoryProducer() {}

    public static AbstractBeverageFactory getBeverageFactory(boolean isAlcoholic) {
        if (isAlcoholic) {
            return new AlcoholicBeverageFactory();
        }
        return new NonAlcoholicBeverageFactory();
    }
}
