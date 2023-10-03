package br.com.tony.creational.abstractfactory.furniture;

public class ModernChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("ModernChair has legs");
    }

    @Override
    public void sitOn() {
        System.out.println("you can sit on ModernChair");
    }
}
