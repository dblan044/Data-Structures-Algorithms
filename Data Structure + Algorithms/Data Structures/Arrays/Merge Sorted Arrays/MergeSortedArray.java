import java.util.*;
import java.lang.*;
import java.io.*;

public class MergeSortedArray {
    //create a function to merge two sorted arrays
    //array1 {1,2,4,5,8} and array2 {3,6,10} should be array3 {1,2,3,4,5,6,8,10} 
    public static void mergeArrays(int[] array1, int[] array2, int n1, int n2, int[] array3){
        int i = 0, j = 0, k = 0;
        
        //traverse both arrays
        while(i < n1 && j < n2){
            //check if current element of array1 is smaller than array2
            //if true, store the first element into array3 and increment index
            //otherwise, do the same for array2
            if(array1[i] < array2[j]){
                array3[k++] = array1[i++];
            }else{
                array3[k++] = array2[j++];
            }
        }
        
        //store remaining elements of array1
        while(i < n1){
            array3[k++] = array1[i++];
        }
        
        //store remaining elements of array2
        while(j < n2){
            array3[k++] = array2[j++];
        }
    }
}
