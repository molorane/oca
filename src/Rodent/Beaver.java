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
public class Beaver extends Rodent {

    public static Integer chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood");
        return 2;
    }
}
