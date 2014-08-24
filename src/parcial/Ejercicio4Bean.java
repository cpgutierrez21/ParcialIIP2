/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "ejercicio4")
@RequestScoped
public class Ejercicio4Bean {
 private double catA=0;
 private double catB=0;
 private double resultado;

    public void setCatA(double catA) {this.catA = catA;}
    public void setCatB(double catB) {this.catB = catB;}

    public double getCatA() {
        return catA;
    }

    public double getCatB() {
        return catB;
    }

    public double getResultado() {
        return resultado;
    } 
 
    public String calcularHip() {
         resultado=Math.sqrt(Math.pow(catA, 2)+Math.pow(catB, 2)); 
         return "success4";
    }
    
    
}
