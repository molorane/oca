/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sum3and5Challenge;

import java.util.function.Predicate;

/**
 *
 * @author madw
 */
interface Njabulo {
    boolean isFactor(int i);
}

public class MothusiSolution {
   
    public static void main(String[] args) {
        MothusiSolution ms = new MothusiSolution();
        test(i -> (i % 5 == 0), i -> i % 10 == 0);
    }

    public static void test(Predicate<Integer> condition, Njabulo njabulo) {
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if (condition.test(i)) {
                sum += i;
                count++;
                if(!njabulo.isFactor(i))
                    System.out.print(i + " ");
            }

            if (count == 5) {
                break;
            }
        }
        System.out.println("");
        System.out.println("Sum: " + sum);
    }
}
