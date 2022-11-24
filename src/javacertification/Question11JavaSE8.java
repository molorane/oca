/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacertification;

/**
 *
 * @author Mothusi Molorane
 */
public class Question11JavaSE8 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5, j = 0;
        OUTER: for(int i=0; i<3; )
            INNER: do {
                i++; x++;
                if(x > 10) break INNER;
                x += 4;
                j++;
            } while(j <= 2);
        System.out.println(x);
    } 
}
