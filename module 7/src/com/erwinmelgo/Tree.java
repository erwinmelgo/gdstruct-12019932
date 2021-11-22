package com.erwinmelgo;

public class Tree {
    private Node root;


    public void insert(int value)
    {
        if(root == null)
        {
            root = new Node(value);
        }
        else
        {
            root.insert(value);
        }
    }


    public void traverseInOrder()
    {
        if (root != null)
        {
            root.traverseInOrder();
        }
    }

    public void traverseInDescendingOrder()
    {
        if (root != null)
        {
            root.traverseInDescendingOrder();
        }
    }

    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }

    public int findMinimum()
    {
        return getMin(this.root);
    }

    public int findMaximum()
    {
        return getMax(this.root);
    }
    private int getMin(Node root)
    {
        if(root.getLeftChild() != null)
        {
            return getMin(root.getLeftChild());
        }
        return root.getData();
    }

    private int getMax(Node root)
    {
        if (root.getRightChild() != null)
        {
            return getMax(root.getRightChild());
        }
        return root.getData();
    }
}
