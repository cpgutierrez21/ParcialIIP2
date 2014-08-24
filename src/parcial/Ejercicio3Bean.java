/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial;

import javax.inject.Named;
import javax.enterprise.context.Dependent;


@Named(value = "ejercicio3")
@Dependent
public class Ejercicio3Bean {

    int n=0;
    private int suma=0;
    private String resultado;

    public String getResultado() {return resultado;}

    public String calcularSuma() {
        while(n<=10){            
            suma=suma+n;
            n++;           
        }       
        resultado=String.valueOf(suma);
        return "success3";
    }
    
}
