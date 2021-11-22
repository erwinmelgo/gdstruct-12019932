package com.erwinmelgo;

public class Main {

    public static void main(String[] args) {
	Tree tree = new Tree();

	tree.insert(25);
	tree.insert(3);
	tree.insert(29);
	tree.insert(50);
    tree.insert(22);
    tree.insert(-4);
    tree.traverseInDescendingOrder();
    System.out.println("Smallest value: " + tree.findMinimum());
    System.out.println("Biggest value: " + tree.findMaximum());
    }
}
