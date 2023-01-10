package br.com.tony.behavioural.state;

public class PlayingState extends State {

    public PlayingState(Game game) {
        super(game);
        System.out.printf("-- Game in %s state --", this.getClass().getName());
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("Not allowed");
    }

    @Override
    public void onPlaying() {

    }

    @Override
    public void onBreak() {

    }

    @Override
    public void onEndGame() {

    }
}
