package com.pluralsight;

import java.util.HashMap;

public class Card {
    private final CardSuit suit;
    private CardValue value;
    private boolean faceUp;

    private HashMap<CardValue, Integer> valueToPoint;


    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
        this.faceUp = true;

        valueToPoint = new HashMap<>();
        valueToPoint.put(CardValue.ACE, 11);
        valueToPoint.put(CardValue.TWO, 2);
        valueToPoint.put(CardValue.THREE, 3);
        valueToPoint.put(CardValue.FOUR, 4);
        valueToPoint.put(CardValue.FIVE, 5);
        valueToPoint.put(CardValue.SIX, 6);
        valueToPoint.put(CardValue.SEVEN, 7);
        valueToPoint.put(CardValue.EIGHT, 8);
        valueToPoint.put(CardValue.NINE, 9);
        valueToPoint.put(CardValue.TEN, 10);
        valueToPoint.put(CardValue.JACK, 10);
        valueToPoint.put(CardValue.QUEEN, 10);
        valueToPoint.put(CardValue.KING, 10);
    }

    public CardSuit getSuit() {
        if (!faceUp) {
            return null;
        }
        return suit;
    }

    public CardValue getValue() {
        if (!faceUp) {
            return null;
        }
        return value;

    }

    public int getPointValue() {
        if (faceUp) {
            return valueToPoint.get(value);
        }
        return 0;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public void flip() {
        faceUp = !faceUp;
    }

    public void convertAce () {
        if (value == CardValue.ACE) {
            valueToPoint.replace(CardValue.ACE, 1);
        }
    }

    @Override
    public String toString() {
        if (!faceUp) {
            return "Face Down";
        }
        return String.format("""
                Suit: %s
                Value: %s
                """, ca);
    }
}
