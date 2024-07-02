package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void deal (Card card) {
        cards.add(card);
    }

    public int getSize() {
        return cards.size();
    }

    public int getPointValue() {
        while (sumHand() > 21 && containsHighAces()) {
            Card ace = getFirstAce();
            ace.convertAce();
        }
        return sumHand();
    }

    private int sumHand() {
        int pointSum = 0;
        for (Card card: cards) {
            boolean flipBack = false;
            if (!card.isFaceUp()) {
                card.flip();
                flipBack = true;
            }
            pointSum += card.getPointValue();
            if (flipBack) {
                card.flip();
            }
        }
        return pointSum;
    }

    private boolean containsHighAces() {
        return cards.stream()
                .anyMatch(card -> card.getValue() == CardValue.ACE && card.getPointValue() == 11);
    }

    private Card getFirstAce() {
        return cards.stream()
                .filter(card -> card.getValue() == CardValue.ACE && card.getPointValue() == 11)
                .findFirst()
                .orElse(null);
}
}
