package com.sort;

public class LinearSearch {
    // Returns count of rotations for an 
    // array which is first sorted in 
    // ascending order, then rotated
    static int countRotations(int arr[], int n)
    {
        // We basically find index of minimum
        // element
        int min = arr[0], min_index = -1;
        for (int i = 0; i < n; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
                min_index = i;
            }
        } 
        return min_index;
    }
 
    // Driver program to test above functions
    public static void main (String[] args) 
    {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
     
        System.out.println(countRotations(arr, n));
    }
}
