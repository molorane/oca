/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondsMinutesChallenge;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Collections.sort;

/**
 *
 * @author madw
 */

interface J{
    static void jj(){
        System.out.println("static interface method");
    }
}

class Lion implements J{
    
    static void jj(){
        J.jj();
        System.out.println("static interface method");
    }

    public Lion(int o) {

    }

    public void p() throws IOException {
        System.out.println("parent p");
    }

    public void roar(String roar1, StringBuilder roar2) {
        roar1.concat("!!!");
        roar2.append("!!!");
    }
}

public class Overloading extends Lion {

    public final int total = 0;
    
    protected static int i;

    static {
        //total = 0;
    }

    public Overloading() {
        super(9);
        i = 0;
    }

    public Overloading(int... n) {
        //total = 9;
        super(9);
    }
    
    static final void a(boolean ...b){
        return;
    }

    @Override
    public void p() {
        System.out.println("parent p");
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.p();
        Predicate<String> p = (a) -> {
            return a.equals("Mothusi");
        };
        System.out.println(p.test("Mothusi"));

        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies); // [long ear, floppy, hoppy]
        bunnies.removeIf((String s) -> s.charAt(0) != 'h');
        System.out.println(bunnies);
        sort(bunnies);
        
        Lion.jj();
    }
}
