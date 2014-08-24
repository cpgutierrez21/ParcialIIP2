/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "ejercicio5")
@RequestScoped
public class Ejercicio5Bean {
    private int r=0;
    private int h=0;
    private double pi=3.14;
    private double resultado;

    public void setR(int r) {this.r = r;}
    public void setH(int h) {this.h = h;}
    public int getR() {return r;}
    public int getH() {return h;}
    public double getResultado() {return resultado;}
    
    public String calcularVol() {
        resultado=0;
        resultado= (pi*Math.pow(r, 2)*h);
        return "success5";
    }

    public String calcularArea() {
        resultado=0;
        resultado= (2*pi*r*h);
        return "success5";
    }   
    
}
