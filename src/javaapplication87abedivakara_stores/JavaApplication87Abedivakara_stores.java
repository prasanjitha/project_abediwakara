/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication87abedivakara_stores;

/**
 *
 * @author User
 */
public class JavaApplication87Abedivakara_stores {

    /**
     * @param args the command line arguments
     */
  
    
}

interface pi01{
    default void m1(){
        System.out.println("pi01");
    }
}
interface pi02{
    default void m1(){
        System.out.println("pi02");
    }
    
}
class chi implements pi01,pi02{
  
      public static void main(String[] args) {
        // TODO code application logic here
          chi c=new chi();
          c.m1();
          c.m3();
    }
     public void m1(){
          pi01.super.m1();
          pi02.super.m1();
      }
      public void m3(){
        System.out.println("hi");
    }
}