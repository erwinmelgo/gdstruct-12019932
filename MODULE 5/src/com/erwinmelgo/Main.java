package com.erwinmelgo;

public class Main {

    public static void main(String[] args) {

        Player ploo = new Player(134, "Plooful", 135);
        Player wardell = new Player(536, "TSM Wardell", 640);
        Player deadlyJimmy = new Player(32, "DeadlyJimmy", 32);
        Player subroza = new Player(4931, "Subroza", 604);
        Player raijin = new Player(69, "Raijin", 420);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(ploo.getUserName(), ploo);
        hashtable.put(wardell.getUserName(), wardell);
        hashtable.put(deadlyJimmy.getUserName(), deadlyJimmy);
        hashtable.put(subroza.getUserName(), subroza);
        hashtable.put(raijin.getUserName(), raijin);

        hashtable.printHashtable();

        System.out.println("Removing Wardell....");
        hashtable.remove("TSM Wardell");

        System.out.println("The updated Hashtable: ");
        hashtable.printHashtable();



    }
}
