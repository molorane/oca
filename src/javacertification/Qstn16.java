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
public class Qstn16 {
    
    public static void main(String[] args) {
        // TODO code application logic here
       List<String> list = new ArrayList<>();
       search(list);
    }
    
    public static void search(List<String> list) {
        list.clear();
        list.add("b");
        list.add("a");
        list.add("c");
        System.out.println(Collections.binarySearch(list, "a"));
    }
}
