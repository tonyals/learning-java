package br.com.tony.creational.abstractfactory.smartphone;

import br.com.tony.creational.abstractfactory.smartphone.factory.AndroidSmartPhoneFactory;
import br.com.tony.creational.abstractfactory.smartphone.factory.IOSSmartPhoneFactory;
import br.com.tony.creational.abstractfactory.smartphone.factory.SmartPhoneFactory;
import br.com.tony.creational.abstractfactory.smartphone.model.SmartPhone;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        SmartPhone androidSmartPhone = SmartPhoneFactory.getSmartPhone(new AndroidSmartPhoneFactory("Android Lollipo", "Samsung", "S21 Ultra"));
        SmartPhone iosSmartPhone = SmartPhoneFactory.getSmartPhone(new IOSSmartPhoneFactory("IOS 17", "Apple", "14 Pro Max"));

        System.out.println(androidSmartPhone);
        System.out.println(iosSmartPhone);
    }
}
