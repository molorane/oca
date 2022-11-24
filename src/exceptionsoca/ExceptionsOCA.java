/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionsoca;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Mothusi Molorane
 */
public class ExceptionsOCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            throw new ExhibitClosed();
        } catch (ExhibitClosedForLunch e) {// first catch block
        System.out.println("try back later");
        } catch (ExhibitClosed  e) {// second catch block
        System.out.println("not today");
        }
        
       ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(101);
       list.add(23);
       Collections.sort(list);
       Integer ar[] = list.toArray(new Integer[2]);
       for(Integer str:ar){
           System.out.println(str);
       }
    }
    
}
