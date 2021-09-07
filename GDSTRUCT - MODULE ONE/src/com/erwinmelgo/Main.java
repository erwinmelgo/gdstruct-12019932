package com.erwinmelgo;

public class Main {

    public static void main(String[] args) {
	int[] numbers = new int[5];

        numbers[0] = 120;
        numbers[1] = -8;
        numbers[2] = 24;
        numbers[3] = 5;
        numbers[4] = 67;


        newSelectionSort(numbers);
        printArray(numbers);

    }
    private static void bubbleSortAscending(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for(int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    // Answer for question number 1
    private static void bubbleSortDescending(int[] arr)
    {
        for (int lastSortedIndex = arr.length; lastSortedIndex > 0; lastSortedIndex--)
        {
            for(int i = 1; i < lastSortedIndex; i++)
            {
                if (arr[i] > arr[i-1])
                {
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }
        }   }
    }
    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;
            for (int i =1; i <= lastSortedIndex; i++)
            {
                if (arr[i] > arr[largestIndex])
                {
                    largestIndex = i;
                }
            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }
    // Answer for question 1
    private static void selectionSortDescend(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;
            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[largestIndex])
                {
                    largestIndex = i;
                }
            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }
    // Answer for question 2
    private static void newSelectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;
            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[smallestIndex] > arr[i])
                {
                    smallestIndex = i;
                }
            }
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[lastSortedIndex];
            arr[lastSortedIndex] = temp;
        }
    }

    private static void printArray(int[] arr)
    {
        for (int j : arr)
        {
            System.out.println(j);
        }
    }

}
