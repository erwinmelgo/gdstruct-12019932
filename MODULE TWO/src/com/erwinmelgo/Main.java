package com.erwinmelgo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

          Player asuna = new Player(1,"Asuna", 100);
          Player lethalBacon = new Player(2, "LethalBacon", 205);
          Player hpDeskJet = new Player(3,"HPDeskJet", 34);
          Player reyna = new Player(4,"Reyna", 400);
          Player jett = new Player(5,"filipino jett", 999);
          PlayerLinkedList playerLinkedList = new PlayerLinkedList();


          playerLinkedList.addToFront(reyna);
          playerLinkedList.addToFront(asuna);
          playerLinkedList.addToFront(lethalBacon);
          playerLinkedList.addToFront(jett);
          playerLinkedList.addToFront(hpDeskJet);


          playerLinkedList.removeFirst();


          System.out.println("Size of list: ");
          System.out.println(playerLinkedList.getSize());


          System.out.println("Does it contain Asuna? ");
          System.out.println(playerLinkedList.contains(asuna));


          System.out.println("At which index? ");
          System.out.println(playerLinkedList.indexOf(asuna));


          playerLinkedList.printList();


    }

}
