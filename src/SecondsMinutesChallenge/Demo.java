/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondsMinutesChallenge;

import static java.lang.System.*;
import java.util.function.Predicate;
import oca.CC;

/**
 *
 * @author madw
 */
class C {

    protected static void getLength() {
        System.out.println("parent");
    }
}

public class Demo extends C {

    int i = 1;

    protected static void getLength() {
       System.out.println("child");
    }

    public static void main(String[] args) {

        MothusiSolution ms = new MothusiSolution();
        NjabuloSolution ns = new NjabuloSolution();
        out.println("---Mothusi Solution---");
        out.println(ms.getDurationString(2000));
        out.println(ms.getDurationString(1200, 10));
        out.println("---Njabulo Solution---");
        out.println(ns.getDurationString(2000));
        out.println(ns.getDurationString(1200, 10));

        Demo d = new Demo();
        //check(d, p -> p.i < 5);

        d.getLength();
    }

    private static void check(Demo panda, Predicate<Demo> pred) {
        String result = pred.test(panda) ? "match" : "not match";
        System.out.print(result);
    }
}
