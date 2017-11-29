package eu.cz.culs.kii.model;

public class GameSettingsModel {

    private int initialNumberOfGamesPerPlayer;
    private int numberOfPlayers;
    private long initialCapital;

    public GameSettingsModel() {}

    public GameSettingsModel(int initialNumberOfGamesPerPlayer, int numberOfPlayers, long initialCaptial) {
        this.initialNumberOfGamesPerPlayer = initialNumberOfGamesPerPlayer;
        this.numberOfPlayers = numberOfPlayers;
        this.initialCapital = initialCaptial;
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

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(long initialCaptial) {
        this.initialCapital = initialCaptial;
    }

    @Override
    public String toString() {
        return "GameSettingsModel{" +
                "initialNumberOfGamesPerPlayer=" + initialNumberOfGamesPerPlayer +
                ", numberOfPlayers=" + numberOfPlayers +
                ", initialCaptial=" + initialCapital +
                '}';
    }
}
