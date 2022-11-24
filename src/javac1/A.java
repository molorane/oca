/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javac1;

/**
 *
 * @author moloranemothusimichael
 */
public class A {
    
    private static int Count = 0;
    
    public A(){
        Count++;
    }
    
    public static int getInstanceCount(){
        return Count;
    }
    
}
