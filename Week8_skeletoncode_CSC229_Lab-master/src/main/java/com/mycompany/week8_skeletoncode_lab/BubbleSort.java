/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {
    
public static void bubbleSort(int a[], int size) {
    int outer, inner, temp;
    for (outer = size - 1; outer > 0; outer--) { 
        for (inner = 0; inner < outer; inner++) { 
            if (a[inner] > a[inner+1]) { 
                
                temp = a[inner];
                a[inner] = a[inner+1];
                a[inner+1] = temp;
            }
        }
    }
}

}
