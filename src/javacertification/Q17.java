/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacertification;

/**
 *
 * @author moloranemothusimichael
 */
public class Q17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name = "four";
        int check = 4;
        
        //check -= 1; // check--;
        
        
        System.out.println(check -= 1);
        
        //System.out.println(name.charAt(check -= 1));
        
        ClassA classA = new ClassA();
        classA.MethodA();
    }
    
    
    public static class ClassA {
        public void MethodA(){
            ClassB classB = new ClassB();
            
            System.out.println(classB.getValue());
        }
    }
    
}



class ClassB {
    public ClassC classc;
    
    public String getValue(){
        classc = new ClassC();
        return classc.getValue();
    }
}

class ClassC {
    private String value;
    
    public String getValue(){
        value = "ClassB";
        
        return value;
    }
}
