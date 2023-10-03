package br.com.tony.creational.abstractfactory.smartphone.factory;

import br.com.tony.creational.abstractfactory.smartphone.model.SmartPhone;

public class SmartPhoneFactory  {

    private SmartPhoneFactory() { }

    public static SmartPhone getSmartPhone(SmartPhoneAbstractFactory abstractFactory) {
        return abstractFactory.createSmartPhone();
    }
}
