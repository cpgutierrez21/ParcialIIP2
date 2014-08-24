/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "ejercicio8")
@RequestScoped
public class Ejercicio8Bean {   
    private int a;   
    private int b;
    private int temp;
    private String s;
   
    public void setA(int a){this.a=a;}
    public void setB(int b){this.b=b;}       
    public int getA(){return this.a;}
    public int getB(){return this.b;}
    public String gets(){return this.s;}
     

    public String ordenar() {
        temp=0;
        if(a>b){temp=b;b=a;a=temp;}
        s="Orden = "+a+","+b;
        return "success8";
    }
    
}
