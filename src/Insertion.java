import java.util.Scanner;
public class Insertion {

    // Insertion sort function for an array made of doubles
    public static Double[] insertionSort(Double[] arr){
        // Step 1: First loop through the array from 1 - arr.length
        // make sure to start at the second position in the array
        for(int i = 1; i < arr.length; i++){
            // Create a key for comparing
            Double key = arr[i];
            // Assign the predecessor to a variable
            int j = i - 1;

            // Step 2: Create inner while loop
            // Use the key to compare to the predecessor, if the key is greater, we move the predecessor
            // one position up until we find the next sorted number not greater than the key
            // while condition 1: predecessor is positive
            // while condition 2: arr[predecessor] is larger than key (current number of array)
            while(j >= 0 && arr[j] > key){
                // arr[number in front of predecessor] gets assigned to arr[predecessor]
                arr[j + 1] = arr[j];
                // go to the next predecessor to keep going down the line
                j--;
            }
            // Once out of the loop, assign the key to the next number. arr[predecessor + 1]
            arr[j + 1] = key;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
