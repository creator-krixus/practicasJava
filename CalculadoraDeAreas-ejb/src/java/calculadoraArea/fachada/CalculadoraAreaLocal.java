/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraArea.fachada;

import javax.ejb.Local;


/**
 *
 * @author Wilson
 */
@Local
public interface CalculadoraAreaLocal {

    
    public float cuadrado (float lado);
    public double triangulo (double base, double altura);
    public double circulo (double radio);
    
}
