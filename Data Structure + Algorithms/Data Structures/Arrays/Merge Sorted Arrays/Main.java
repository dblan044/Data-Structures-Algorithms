import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2,4,5,8};
        int n1 = array1.length;
        System.out.println("First Array: " + Arrays.toString(array1));
        
        int[] array2 = {3,6,10};
        int n2 = array2.length;
        System.out.println("Second Array: " + Arrays.toString(array2));
        
        int[] array3 = new int[n1 + n2];
        
        MergeSortedArray.mergeArrays(array1, array2, n1, n2, array3);
        
        System.out.println("Array after merging: " + Arrays.toString(array3));
    }