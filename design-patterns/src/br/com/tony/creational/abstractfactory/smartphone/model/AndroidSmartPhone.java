package br.com.tony.creational.abstractfactory.smartphone.model;

public class AndroidSmartPhone implements SmartPhone {

    private final String os;
    private final String company;
    private final String model;

    public AndroidSmartPhone(String os, String company, String model) {
        this.os = os;
        this.company = company;
        this.model = model;
    }

    @Override
    public String getOs() {
        return os;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "AndroidSmartPhone{" +
                "os='" + os + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
