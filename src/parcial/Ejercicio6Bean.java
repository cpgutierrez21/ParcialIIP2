/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "ejercicio6")
@RequestScoped
public class Ejercicio6Bean {
    private int n;    
    private String s;

    public void setN(int n) {this.n = n;}
    public int getN() {return n;}
    public String getS() {return s;}    
    
    public String calcular() {
        if(n%2==0){s="Es par";}else {s="Es impar";}        
        return "success6";
    }   
    
}
