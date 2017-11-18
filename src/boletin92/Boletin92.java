/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin92;

/**
 *
 * @author Juan
 */
public class Boletin92 {



public void numero(){
  for (int numb =10,num=10;num<=90;num++){
      System.out.println("suma: "+(num+numb));  
     System.out.println("multiplicación: "+(num*numb));
      
  if(num==90){
      for (numb=10;numb<=90;numb++){
          System.out.println("suma: "+(num+numb));  
     System.out.println("multiplicación: "+(num*numb));
      }
  }  
  }
 
  
  
  }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Boletin92 a=new Boletin92();
    a.numero();
     
         }      
             
        }
    




//Realiza un programa que calcule a suma e o producto dos números comprendidos entre 10 e 90 .