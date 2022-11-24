/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacertification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mothusi Molorane
 */
public class Qstn25 {
    
    interface A { public void aMethod(); }
    interface B { public void bMethod(); }
    interface C extends A,B { public void cMethod(); }
    
    class D implements B {
        public void bMethod(){
            System.out.println("D - bmethod");
        }
    }
    
    class E extends D implements C {
        @Override
        public void aMethod(){
            System.out.println("E - amethod");
        }
        @Override
        public void bMethod(){
            System.out.println("E - bmethod");
        }
        @Override
        public void cMethod(){
            System.out.println("E - cmethod");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Qstn25 qs = new Qstn25();
        qs.run();
    }
    
    
    public void run(){
        D e = (D)(new E());
        e.bMethod();
    }
    
}
