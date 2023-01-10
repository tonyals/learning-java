package br.com.tony.behavioural.state;

public class Game {
    private State state = new WelcomeScreenState(this);

    public void changeState(State state) {
        this.state = state;
    }
}
