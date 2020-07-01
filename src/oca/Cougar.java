/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca;

import java.io.EOFException;
import java.util.function.Predicate;

import java.sql.*;
import java.util.Date;

/**
 *
 * @author madw
 */
abstract class Puma {

    Date d;
    static String st = "puma";
    String p = "puma p";
    private String i;

    public void p() throws EOFException {
        System.out.println("Puma");
    }

    public static void p1() {
        System.out.println("Puma static");
    }
}

interface Animal {

    public String getName();
}

interface Mammal {

    public String getName();
}

abstract class Otter extends Cougar implements Mammal, Animal {

    @Override
    public abstract String getName();
}

public class Cougar extends Puma {

    String p = "Cougar p";
    static String st = "Cougar";
    private String i = "Cougar";

    @Override
    public void p() throws EOFException {
        System.out.println("Cougar");
    }

    public static void p1() {
        System.out.println("Cougar static");
    }

    public final static void main(String[] args) throws Exception {
        i();
    }
    
    
    public static void i(int ...i){
        System.out.println("varargs");
    }
}
