/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hidden;

import java.io.IOException;

/**
 *
 * @author madw
 */


class Pelican extends Bird {

    protected void fly() throws RuntimeException{
        System.out.println("Pelican is flying");
    }
}

public class Bird {

    protected void fly() throws IOException {
        System.out.println("Bird is flying");
    }

    public static void main(String[] args) throws Exception {
        Bird bird = new Pelican();
        bird.fly();
        Integer.parseInt("1234");
    }
}

