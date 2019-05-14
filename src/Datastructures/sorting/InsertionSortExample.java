package Datastructures.sorting;

import java.util.Arrays;

/**
 * InsertionSort
 * 
 * @Complexity: O(n2)
 * 
 * @author sudeep.gangula
 *
 *         https://www.tutorialspoint.com/data_structures_algorithms/insertion_sort_algorithm.htm
 */
public class InsertionSortExample { 
	
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){   
    	
        int[] arr1 = {9,14,3,2,43,11,58,22};   
        
        System.out.println("Before Insertion Sort");    
        System.out.println(Arrays.toString(arr1));    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort"); 
        System.out.println(Arrays.toString(arr1));    
    }    
}    