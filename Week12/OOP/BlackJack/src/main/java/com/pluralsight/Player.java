package com.pluralsight;

public class Player {
    private Hand hand;
    private String playerName;
    boolean dealer;

    public Player(String playerName) {
        this.playerName = playerName;
        hand = new Hand();
    }

    public Player(String playerName, boolean dealer) {
        this.playerName = playerName;
        this.dealer = dealer;
    }

    public Hand getHand() {
        return hand;
    }

    public String getPlayerName() {
        return playerName;
    }


    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
