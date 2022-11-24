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
public class Q18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        test("four");
        test("tee");
        test("to");
    }
    
    public static void test(String str) {
        int check = 4;
        if (check == str.length()) {
            System.out.print(str.charAt(check -= 1) +", ");  
        } 
        else{
            System.out.print(str.charAt(0) + ", "); 
        }
    }
}
