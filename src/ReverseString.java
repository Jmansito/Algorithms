public class ReverseString {
    public static StringBuilder reverse(String str){
        // Function to reverse a string in java
        // Adding for interview practice

        // NULL string check
        if(str == null)
            throw new IllegalArgumentException("Empty string");

        StringBuilder reversed = new StringBuilder();
        // IMPORTANT!! Create a char array of the given string
        char[] chars = str.toCharArray();
        for(int i = chars.length - 1; i >= 0; i--){
            reversed.append(chars[i]);
        }
        return reversed;
    }
}
