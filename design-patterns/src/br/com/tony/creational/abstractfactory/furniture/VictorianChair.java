package br.com.tony.creational.abstractfactory.furniture;

public class VictorianChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("VictorianChair has legs");
    }

    @Override
    public void sitOn() {
        System.out.println("you can sit on VictorianChair");
    }
}
