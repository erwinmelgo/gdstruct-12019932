package com.erwinmelgo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        ArrayQueue queue = new ArrayQueue(30);
        int games = 0;
        startProgram(games,queue);
    }
    public static void generatePlayer(int number, ArrayQueue queue)
    {
        int min = 1;
        int max = 2674;
        for (int i = 0; i <= number; i++)
        {
            int rng = (int)Math.floor(Math.random()*(max-min+1)+min);
            queue.add(new Player(rng,"Player " + rng,100));
        }
    }
    public static void startProgram(int games, ArrayQueue queue)
    {
        while(true)
        {
            int random = (int)Math.floor(Math.random()*(7-1+1)+1); // Random number of players from 1 to 7
            System.out.println("Games created: " + games);
            System.out.println("Starting queue...");
            new Scanner(System.in).nextLine(); // Press enter key to end turn
            generatePlayer(random,queue);
            System.out.println("Players found!\n");
            System.out.println("Players: ");
            queue.printQueue();
            if (queue.size() < 5)
                System.out.println("Finding opponents...");
            if (queue.size() >= 5)
            {
                System.out.println("Match found!");
                games++; // Increment games
                System.out.println("Players popped: \n");
                for(int i = 0; i < 5; i++)
                {
                    System.out.println(queue.remove());// remove first five players
                }
                System.out.println("Players left in queue: ");
                queue.printQueue();
            }
            if (games == 10)
            {
                System.out.println("Successfully created 10 games.");
                new Scanner(System.in).nextLine(); // Press enter key to end turn
                break;
            }
        }
        System.out.println("Program terminated.");
    }
}
