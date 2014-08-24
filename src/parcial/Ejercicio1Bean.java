/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "ejercicio1")
@RequestScoped
public class Ejercicio1Bean {   
    private int a;   
    private int b;
    private String s;
   
    public void setA(int a){this.a=a;}
    public void setB(int b){this.b=b;}       
    public int getA(){return this.a;}
    public int getB(){return this.b;}
    public String gets(){return this.s;}
     

    public String encontrarMayor() {        
        //return("10 es el mayor");
        if (a>b){s="a es el mayor";}
        else {s="b es el mayor";}
        return "success1";
    }
    
}
