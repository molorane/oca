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
public class OracleExam {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Table obj = new Table();//only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
    
    
    public boolean isB(String str){
        return Boolean.valueOf(str);
    } 
    
    
    static class Table{  
  
       synchronized void printTable(int n,String str){//method not synchronized  
           for(int i=1;i<=5;i++){  
             System.out.println(str+":"+n*i);  
             try{  
              Thread.sleep(1000);  
             }catch(Exception e){System.out.println(e);}  
           }  

         }  
    }  

    static class MyThread1 extends Thread{  
        Table t;
        
        MyThread1(Table t){  
            this.t=t;  
        }  
        public void run(){  
            t.printTable(5,"Thread1");  
        } 
    }
    
    static class MyThread2 extends Thread{  
        Table t; 
        
        MyThread2(Table t){  
            this.t=t;  
        }  
        public void run(){  
            t.printTable(100,"Thread2");  
        }  
    }  
    
}
