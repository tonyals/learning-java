package br.com.tony.behavioural.state;

public class WelcomeScreenState extends State {

    public WelcomeScreenState(Game game) {
        super(game);
        System.out.printf("-- Game in %s state --", this.getClass().getName());
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("Currently on welcome screen");
    }

    @Override
    public void onPlaying() {
        this.getGame().changeState(new PlayingState(this.getGame()));
    }

    @Override
    public void onBreak() {
        System.out.println("Not allowed");
    }

    @Override
    public void onEndGame() {
        System.out.println("Not allowed");
    }
}
