/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "ejercicio2")
@RequestScoped
public class Ejercicio2Bean {

   private int a=0;
    private int b=0;
    private int c=0;
    private String s;
    public void setA(int a){this.a=a;}
    public void setB(int b){this.b=b;}
    public void setC(int c){this.c=c;}
    public int getA(){return this.a;}
    public int getB(){return this.b;}
    public int getC(){return this.c;}
    public String gets(){return this.s;}

    public Object encontrarMayor() {    
        if (a>b && a>c){s="a es el mayor";}
        else if (b>a && b>c){s="b es el mayor";}
        else{s="c es el mayor";}
        return "success2";        
    }
}
