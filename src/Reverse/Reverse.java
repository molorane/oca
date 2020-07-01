/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reverse;

/**
 *
 * @author madw
 */
interface Operation {

    int func(int num, int num1);
}

public class Reverse {

    public static void main(String[] args) {
        int l = 123456;
        String str = "123456";
        StringBuilder sb = new StringBuilder(str);
        //System.out.println("Solution1: "+reverse(str));
        //System.out.println("Solution2: "+reverse(sb));
        //System.out.println("Solution3: "+reverse(l));
        //System.out.println("Count digits: "+countDigits(l));

        int num = 1234;
        System.out.println("Add digits: " + Digits(num, (x, y) -> x += y % 10));
        System.out.println("Multiplying digits: " + Digits(num, (x, y) -> x *= y % 10));
    }

    public static int Digits(int num, Operation operation) {
        int sum = 1;
        while (num >= 1) {
            sum = operation.func(sum, num);
            num /= 10;
        }
        return sum;
    }

    public static int countDigits(long num) {
        int digits = 0;
        while (num > 10) {
            System.out.println("current num: " + num);
            num /= 10;
            digits++;
        }
        return digits + 1;
    }

    public static String reverse(String str) {
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }
        return reverseString;
    }

    public static String reverse(StringBuilder str) {
        return str.reverse().toString();
    }

    public static int reverse(int num) {
        int reverse = 0;
        int temp = num;
        int remainder = 0;

        while (temp > 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        return reverse;
    }

}
