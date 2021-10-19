package com.erwinmelgo;

public class Main {

    public static void main(String[] args) {
	    int[] numbers = {-10, 20, 30, 55, 28, 22, 100, 99, 23,47,69};

        int i = ferrariPeek(numbers, 20);

        System.out.println(i);

    }

    public static int ferrariPeek(int[] input, int value)
    {
        int endPoint = input[input.length - 1]; // Initialize end point
        int startPoint = input[0]; // Initialize start point
        for (int i = 1; i < input.length; i++)
        {
            if (startPoint == value)
            {
                return startPoint;
            }
            if (endPoint == value)
            {
                return endPoint;
            }
            if (startPoint != input[i] && endPoint != input[input.length - 2])
            {
                startPoint = input[i]; // start point will disregard first element and move on to the next as new start point
                endPoint = (input[i] - input.length); // end point will move on to the second to the last element as new end point
                if (startPoint == value)
                {
                    return startPoint;
                }
                if (endPoint == value)
                {
                    return endPoint;
                }
            }
        }
        return -1;
    }
}
