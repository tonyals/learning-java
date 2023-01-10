package br.com.tony.behavioural.state;

public abstract class State {
    private Game game;
    public State(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public abstract void onWelcomeScreen();
    public abstract void onPlaying();
    public abstract void onBreak();
    public abstract void onEndGame();
}
