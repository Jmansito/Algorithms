import java.util.Scanner;

public class Main {

    public static void output(Double[] arr){
        for (Double v : arr) {System.out.print(v + " ");}
    }
    public static void output(int[] arr){
        for (int v : arr) {System.out.print(v + " ");}
    }

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

        // Reverse string practice
        System.out.println("Reverse String \"String Test\": ");
        System.out.println(ReverseString.reverse("String Test"));

        // Sorting results
        System.out.println("\nSelection sort results: ");
        output(Selection.selection(userNumbers));
        System.out.println("\nInsertion sort results: ");
        output(Insertion.insertionSort(userNumbers));
        System.out.println("\nBubble sort results: ");
        output(Bubble.bubble(userNumbers));
    }
}
