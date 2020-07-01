/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge1;

/**
 *
 * @author madw
 */

public class Factorial {
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    
    public static int factorial(int num){
        if(num == 1)
            return 1;
        return num * factorial(num-1);
    }
}
