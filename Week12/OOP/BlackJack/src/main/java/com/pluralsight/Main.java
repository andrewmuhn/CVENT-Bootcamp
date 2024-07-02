package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card(CardSuit.DIAMONDS, CardValue.ACE);
        Card card2 = new Card(CardSuit.DIAMONDS, CardValue.KING);
        Card card3 = new Card(CardSuit.DIAMONDS, CardValue.ACE);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
        Hand hand = new Hand(cards);
        hand.deal(card3);
        System.out.println(hand.getPointValue());
    }
}
