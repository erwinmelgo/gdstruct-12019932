package com.erwinmelgo;

import java.util.EmptyStackException;

public class CardStack {
    private Card[] stack;
    private int top;

    public int getNumber() {
        return number;
    }

    private int number = 0;


    public CardStack(int capacity)
    {
        stack = new Card[capacity];
    }

    public void push(Card card)
    {
        if (top == stack.length)
        {
            Card[] newDeck = new Card[2 * stack.length];
            System.arraycopy(stack,0,newDeck,0,stack.length);
            stack = newDeck;
        }
        stack[top++] = card;
        number++;
    }

    public Card pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Card poppedCard = stack[--top];
        stack[top] = null;
        number--;
        return poppedCard;
    }

    public Card peek()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public boolean isEmpty()
    {
        return top == 0;
    }

    public void printStack()
    {
        System.out.println("Cards: ");
        for (int i = top -1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
    public int printNumber()
    {
        return number;
    }



}

