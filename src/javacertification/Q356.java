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
public class Q356 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        for(int x = 1; x < args.length; x++) {
            System.out.print(args[x] + " ");
        }
        
        A a = new A();
        A a1 = new A();
        A a2 = new A();
        System.out.println(a.getInstanceCount() + " ");
    }
    
    
    static class A{
        private static int count = 0;
        
        public static int getInstanceCount(){
            return count;
        }
        
        public A(){
           count++;
        }
    }
    
}
