public class FizzBuzz {
    /* Question
    Write a short program that prints each number from 1 to 100 on a new line.
    For each multiple of 3, print "Fizz" instead of the number.
    For each multiple of 5, print "Buzz" instead of the number.
    For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
    https://www.hackerrank.com/challenges/fizzbuzz/problem
     */
    public static void main(String[] args) {

        int n = 100;

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0)
                System.out.println("FizzBuzz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(i);
        }
    }
}