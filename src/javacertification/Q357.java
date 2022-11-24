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
public class Q357 {
    
    /**
     * @param args the command line arguments
     */
    
     
    static class Beta { }

    static class Alpha {
        Beta b1;
        Beta b2;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Beta b1 = new Beta();
        Beta b2 = new Beta();
        Alpha a1 = new Alpha();
        Alpha a2 = new Alpha();

        a1.b1 = b1;
        a1.b2 = b1;
        a2.b2 = b2;

        a1 = null;
        b1 = null;
        b2 = null;

        //System.out.println(" Line 1    " + " a1   "  + a1.b1);
        //System.out.println(" Line 2    " + " a1   "  + a1.b2);
        //System.out.println(" Line 3    " + " a2   " + a2.b2);
        System.out.println(" Line 4    " + " a1   " + a2.b1);
        System.out.println(" Line 5    " + " b1   " + b1);
        System.out.println(" Line 6    " + " b1   " + b2);
    }
   
       
}
