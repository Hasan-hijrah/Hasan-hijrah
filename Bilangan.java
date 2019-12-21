/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanoop;

/**
 *
 * @author think
 */
public class Bilangan {
    int bilangan;
    
    public Bilangan(int bilangan){
        this.bilangan=bilangan;
    }
    
    void setBil(int bilangan){
        this.bilangan=bilangan;
    }
    
    int getBilangan(){
        return this.bilangan;
    }
  
    void jenisBil(){
        
        System.out.print("bilangan yang diinput merupakan bilangan ");
        if(this.bilangan%2==0 && this.bilangan>0){
           System.out.println(" positif genap");
        }
        else
        if(this.bilangan%2==0 && this.bilangan<0){
            System.out.println(" negatif genap");
        }
        else
        if(this.bilangan%2!=0 && this.bilangan>0){
            System.out.println(" positif ganjil");
        }
        else
            System.out.println(" negatif ganjil");
    }
}
