package eu.cz.culs.kii.model;

public class GameSettingsModel {

    private int initialNumberOfGamesPerPlayer;
    private int numberOfPlayers;
    private long initialCaptial;

    public GameSettingsModel() {}

    public GameSettingsModel(int initialNumberOfGamesPerPlayer, int numberOfPlayers, long initialCaptial) {
        this.initialNumberOfGamesPerPlayer = initialNumberOfGamesPerPlayer;
        this.numberOfPlayers = numberOfPlayers;
        this.initialCaptial = initialCaptial;
    }

    public int getInitialNumberOfGamesPerPlayer() {
        return initialNumberOfGamesPerPlayer;
    }

    public void setInitialNumberOfGamesPerPlayer(int initialNumberOfGamesPerPlayer) {
        this.initialNumberOfGamesPerPlayer = initialNumberOfGamesPerPlayer;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public double getInitialCaptial() {
        return initialCaptial;
    }

    public void setInitialCaptial(long initialCaptial) {
        this.initialCaptial = initialCaptial;
    }

    @Override
    public String toString() {
        return "GameSettingsModel{" +
                "initialNumberOfGamesPerPlayer=" + initialNumberOfGamesPerPlayer +
                ", numberOfPlayers=" + numberOfPlayers +
                ", initialCaptial=" + initialCaptial +
                '}';
    }
}
