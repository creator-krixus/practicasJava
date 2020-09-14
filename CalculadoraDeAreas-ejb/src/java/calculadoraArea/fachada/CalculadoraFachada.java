/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraArea.fachada;

import calculadoraArea.manager.CalculadoraManager;

/**
 *
 * @author Wilson
 */
@Stateles
public class CalculadoraFachada implements CalculadoraAreaLocal{
    
    private CalculadoraManager cal =new CalculadoraManager();

    @Override
    public float cuadrado(float lado) {
        return cal.cuadrado(lado);
    }
    
    @Override
    public double triangulo(double base, double altura) {
        return cal.triangulo(base, altura);
    }

    @Override
    public double circulo(double radio) {
        return cal.circulo(radio);
    }
    
    
}
