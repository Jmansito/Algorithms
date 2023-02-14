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

    public static void output(Double[] arr){
        for (Double aDouble : arr) {
            System.out.print(aDouble + " ");
        }
    }

    // Main driver for class
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter numbers to be sorted, press enter when done: ");
        String userLine = myObj.nextLine();
        // Split all numbers on the spaces
        String[] tokens = userLine.split(" ");
        // Create new double arraylist for the numbers
        Double[] userNumbers = new Double[tokens.length];
        // Assign each token as a double to the double array
        for(int i = 0; i < userNumbers.length; i++){
            userNumbers[i] = Double.parseDouble(tokens[i]);
        }

        output(selection(userNumbers));
    }
}
