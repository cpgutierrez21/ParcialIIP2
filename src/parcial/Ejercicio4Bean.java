/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial;

import javax.inject.Named;
import javax.enterprise.context.Dependent;


@Named(value = "ejercicio4")
@Dependent
public class Ejercicio4Bean {
 private double catA=0;
 private double catB=0;
 private double resultado;

    public void setCatA(double catA) {this.catA = catA;}
    public void setCatB(double catB) {this.catB = catB;}

    public double getResultado() {
        return resultado;
    } 
 
    public String calcularHip() {
         resultado=Math.sqrt(catA+catB); 
         return "success4";
    }
    
    
}
