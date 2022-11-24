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
public class Qstn9 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Object obj = new int[] { 1, 2, 3 };
        int[] someArray = (int[])obj;
        
        for (int i : someArray) 
            System.out.print(i + " ");
        
    }
    
}
