package others;

public class ReverseString {
    public static void main(String[] args) {

        //example input
        String input = "Hello World!";

        System.out.println(reverseString(input));
        System.out.println(reverseStringManually(input));

    }

    public static String reverseString(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
         return stringBuilder.reverse().toString();
    }

    public static String reverseStringManually(String input) {
        char[] chars = new char[input.length()];
        for(int i = input.length()-1, j=0; i >= 0; i--, j++) {
            chars[j] = input.charAt(i);
        }
        return String.valueOf(chars);
    }
}
