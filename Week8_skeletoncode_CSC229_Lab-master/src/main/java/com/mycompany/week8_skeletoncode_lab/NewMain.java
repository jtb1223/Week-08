/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author shtpo
 */
public class NewMain {
    //driver class
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        
    
        runBinarySearchIteratively(arr,8,1,10);
        //space complexity O(1)
        //time complexity is O(logn)
        search(arr, 6);
        //space complexity O(1)
        //time complexity O(n)
        bubbleSort(arr,10);
        //space complexity O(1)
        //time complexity O(n^2) the for loops are nested and increment by n
        getSumOfPrimes(20);
        //space complexity O(1)
        //time complexity O(n)
        
    }
    
}
