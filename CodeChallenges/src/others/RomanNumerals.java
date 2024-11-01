package others;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    public static void main(String[] args) {

        // range up to 3000s
        System.out.println(intToRoman(2163));
        System.out.println(romanToInt("mmclxiii"));
    }

    public static String intToRoman(int num) {

        String[] ones = new String[] {"", "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix"};
        String[] tens = new String[] {"", "x", "xx", "xxx", "xl", "l", "lx", "lxx", "lxxx", "xc"};
        String[] hundreds = new String[] {"", "c", "cc", "ccc", "cd", "d", "dc", "dcc", "dccc", "cm"};
        String[] thousands = new String[] {"", "m", "mm", "mmm"};

        return thousands[num/ 1000] +
                hundreds[(num % 1000) / 100] +
                tens[(num % 100) / 10] +
                ones[num % 10];
    }

    public static int romanToInt(String input) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('i', 1);
        map.put('v', 5);
        map.put('x', 10);
        map.put('l', 50);
        map.put('c', 100);
        map.put('d', 500);
        map.put('m', 1000);

        int result = map.get(input.charAt(0));
        int previous = result;
        for (int i = 1; i < input.length(); i++) {
            int current = map.get(input.charAt(i));
            result += current;
            if (current > previous) {
                result -= (previous * 2);
            }
            previous = current;
        }

        return result;
    }
}
