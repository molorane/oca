/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacertification;

/**
 *
 * @author moloranemothusimichael
 */
public class Q15 {
    public static void main(String [] args) {
        int x = 6;
        Q15 p = new Q15();
        p.doStuff(x);
        System.out.println(" main x = " + x);
    }

   void doStuff(int x) {
        System.out.print(" doStuff x = " + x++);
    }
}
