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
public class Q11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 9;
        System.out.println(++x);
        
        Computation[] computations = new Computation[4];
        
        for(int i=0; i<computations.length;i++){
            computations[i] = new Computation(i);
            computations[i].start();
        }
        
        for(Computation c:computations){
           System.out.println(c.getResult());
        }
    }
    
}

class Computation extends Thread{
    
    private int num;
    private boolean isComplete;
    private int result;
    
    public Computation(int num){
        this.num = num;
    }
    
    @Override
    public synchronized void run(){
        result = num;
        isComplete = true;
        notify();
    }
    
    public synchronized int getResult(){
        try{
               Thread.sleep(1000);
        } catch(InterruptedException e){}
        
        return result;
    }
}
