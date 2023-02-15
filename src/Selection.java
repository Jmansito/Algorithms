import java.util.Scanner;
public class Selection {

    // Selection sort function
    public static Double[] selection(Double[] arr){
        for(int i = 0; i < arr.length - 1; i++){

            // Start by finding the minimum element in unsorted array
            int min = i; // <- start at i each pass to only look in unsorted portion
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min])
                    min = j;
            }
            // Swap the found element with the first element
            Double swap = arr[min];
            arr[min] = arr[i];
            arr[i] = swap;
        }

        return arr;
    }
}
