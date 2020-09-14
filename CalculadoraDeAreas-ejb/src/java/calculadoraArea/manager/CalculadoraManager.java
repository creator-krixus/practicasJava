/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraArea.manager;

/**
 *
 * @author Wilson
 */
public class CalculadoraManager {
    
    public float cuadrado (float lado){
        return lado*lado;
    }
    public double triangulo(double base, double altura){
        return (base*altura)/2;
    }
    public double circulo (double radio){
        return 3.1416*(radio*radio);
    }
    
}
