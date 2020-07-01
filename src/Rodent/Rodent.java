/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rodent;

/**
 *
 * @author madw
 */
class Arthropod {
    
    protected int g;

    public void printName(double input) {
        System.out.print("Arthropod");
    }
}

public class Rodent extends Arthropod{
    protected int g;
    public void printName(int input) { System.out.print("Spider"); }

    protected static int tailLength = 4;

    public void getRodentDetails() {
        System.out.println("[parentTail=" + tailLength + "]");
    }

    protected static Integer chew() throws Exception {
        System.out.println("Rodent is chewing");
        return 1;
    }
}
