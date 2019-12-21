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
public class Deret {
    private int jml_drt;
    private int bilangan_awal;
    private int beda;
    //Integer[] deret=new Integer[this.jml_drt];
    
    public Deret(int bilangan_awal,int beda,int jml_drt){
        this.bilangan_awal=bilangan_awal;
        this.beda=beda;
        this.jml_drt=jml_drt;
    }
    
    public void setJml(int jml_drt){
        this.jml_drt=jml_drt;
    }
    
    public int getJml(){
        return this.jml_drt;
    }
   
    public void setBilangan_awal(int bilangan_awal){
        this.bilangan_awal=bilangan_awal;
    }
    
    public int getBilangan_awal(){
        return this.bilangan_awal;
    }
    
    public void setBeda(int beda){
        this.beda=beda;
    }
    
    public int getBeda(){
        return this.beda;
    }
    
    public Double rataanDeret(){
        
    return 0.0;
    }
    
    public void tampilDeret(){
    Integer[] deret=new Integer[this.jml_drt];
   
    for(int a=0;a<deret.length;a++){
       deret[a]=bilangan_awal;
       bilangan_awal=bilangan_awal+beda;
    }
   
    for(int a=0;a<deret.length;a++){
        System.out.print(deret[a]+" ");
    }
   
   }

   
}
