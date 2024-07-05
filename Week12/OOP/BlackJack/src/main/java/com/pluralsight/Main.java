package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How many players?");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Player0", true));
        for (int i = 1; i < numberOfPlayers; i++) {
            players.add(new Player(String.format("Player%d", i)));
        }

        Deck deck = new Deck();
        deck.shuffle();

        for (Player player: players) {
            Hand hand = new Hand();
            hand.deal(deck.deal());
            hand.deal(deck.deal());
            player.setHand(hand);
            System.out.println(player.getHand());
        }


//        Card card1 = new Card(CardSuit.DIAMONDS, CardValue.ACE);
//        Card card2 = new Card(CardSuit.DIAMONDS, CardValue.KING);
//        Card card3 = new Card(CardSuit.DIAMONDS, CardValue.ACE);
//        ArrayList<Card> cards = new ArrayList<>();
//        cards.add(card1);
//        cards.add(card2);
//        Hand hand = new Hand(cards);
//        hand.deal(card3);
//        System.out.println(hand.getPointValue());
    }
}
