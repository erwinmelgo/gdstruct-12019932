package com.erwinmelgo;

import java.util.LinkedList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
        initiateCardGame();
        System.out.println("You have emptied the deck.");
    }

    public static void generateDeck(CardStack deck)
    {
        for(int i = 0; i < 5; i++)
        {
            deck.push(new Card(0, "Mystic Rush"));
            deck.push(new Card(2, "Sticky Goo"));
            deck.push(new Card(2, "Allergic Reaction"));
            deck.push(new Card(2, "Chomp"));
            deck.push(new Card(2, "Sinister Strike"));
            deck.push(new Card(2, "Poison"));
        }
    }
    public static void drawCards(int number, int numberOfCards, LinkedList<Card> hand, CardStack deck)
    {
        System.out.println("You drew " + number + " cards.");
        for(int i = 0; i < number; i++)
        {
            hand.push(deck.pop());
            numberOfCards++;
        }
    }
    public static void discardCards(int number, int numberOfCards, LinkedList<Card> hand, CardStack pile)
    {
        System.out.println("You discarded " + number + " cards.");
        for(int i = 0; i < number; i++)
        {
            pile.push(hand.pop());
            numberOfCards--;
        }
    }
    public static void evaluateCommand(int command,int number, int numberOfCards, LinkedList<Card> hand, CardStack deck, CardStack pile)
    {
        if (command == 1)
        {
            if (deck.getNumber() < number)
            {
                System.out.println("You cannot get more than or equal to " + number);
                return;
            }
            System.out.println("You drew from the deck");
            drawCards(number, numberOfCards, hand, deck);
        }
        else if (command == 2)
        {
            if (hand.size() < number)
            {
                System.out.println("You cannot discard more than you have.");
                return;
            }
            discardCards(number, numberOfCards,hand,pile);
        }
        else if (command == 3)
        {
            System.out.println("You drew from the discard pile.");
            if (pile.isEmpty())
            {
                System.out.println("There are no cards in the discard pile.");
                return;
            }
            else if (pile.getNumber() < number)
            {
                System.out.println("You cannot get " + number + " cards.");
                return;
            }
            drawCards(number, numberOfCards, hand, pile);
        }
    }
    public static void printList(LinkedList<Card> hand)
    {
        System.out.println("Your cards are: ");
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public static void initiateCardGame()
    {
        CardStack playerDeck = new CardStack(30);
        CardStack pile = new CardStack(30);
        LinkedList<Card> hand = new LinkedList<>();
        int min = 1;
        int max = 5;
        int maxRngCommand = 3;
        int rngCards;
        int rngCommand;
        int numberOfCards = 0;
        generateDeck(playerDeck);

        while(!playerDeck.isEmpty())
        {
            new Scanner(System.in).nextLine();
            rngCards = (int)Math.floor(Math.random()*(max-min+1)+min);
            rngCommand = (int)Math.floor(Math.random()*(maxRngCommand-min+1)+min);
            evaluateCommand(rngCommand,rngCards,numberOfCards,hand,playerDeck,pile);
            printList(hand);
            System.out.println("Cards remaining: " + playerDeck.printNumber());
            System.out.println("Cards in the pile: " + pile.printNumber());
        }
    }
}
