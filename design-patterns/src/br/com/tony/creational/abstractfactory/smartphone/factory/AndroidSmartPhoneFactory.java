package br.com.tony.creational.abstractfactory.smartphone.factory;

import br.com.tony.creational.abstractfactory.smartphone.model.SmartPhone;
import br.com.tony.creational.abstractfactory.smartphone.model.AndroidSmartPhone;

public class AndroidSmartPhoneFactory implements SmartPhoneAbstractFactory {

    private final String os;
    private final String company;
    private final String model;

    public AndroidSmartPhoneFactory(String os, String company, String model) {
        this.os = os;
        this.company = company;
        this.model = model;
    }

    @Override
    public SmartPhone createSmartPhone() {
        return new AndroidSmartPhone(os, company, model);
    }
}
