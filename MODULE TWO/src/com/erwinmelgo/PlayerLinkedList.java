package com.erwinmelgo;

public class PlayerLinkedList {
    private PlayerNode head;
    private int size;
    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++;
    }

    // Prints the list
    public void printList()
    {
        PlayerNode current = head;
        System.out.println("head -> ");
        while(current != null)
        {
            System.out.println(current.getPlayer());
            System.out.println(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    // Removes of the first element
   public void removeFirst()
   {
       PlayerNode playerToRemove = head;
       head = playerToRemove.getNextPlayer();
       size--;
   }

    // Gets the size of the linked list
    public int getSize()
    {
        return size;
    }

    // Boolean expression of whether it contains selected element
    public boolean contains(Player player)
    {
        // Check if head is null
        if (head == null) {
            return false;
        }

        PlayerNode playerToFind = head;
        while(playerToFind != null)
        {
            if (playerToFind.getPlayer() == player) {
                return true;
            }
            playerToFind = playerToFind.getNextPlayer();
        }
        return false;
    }

    // Determines at which index the selected element is in
    public int indexOf(Player player)
    {
        // Check if head is null
        if (head == null) {
            return -1;
        }
        int index = 0;
        PlayerNode indexToFind = head;

        while(indexToFind != null)
        {
            if (indexToFind.getPlayer() == player)
            {
                return index;
            }
            indexToFind = indexToFind.getNextPlayer();
            index++;
        }
        return index;
    }
}
