/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraAreas;

import calculadoraArea.fachada.CalculadoraAreaLocal;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
/**
 *
 * @author Wilson
 */

@WebService(serviceName="Calculadora")

public class Calculadora {
    
     @EJB
    private CalculadoraAreaLocal calculadoraAreaLocal;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "cuadrado")
    public float cuadrado(
            
            @WebParam(name = "lado") float lado) {
        return calculadoraAreaLocal.cuadrado(lado);
    }
    
    @WebMethod(operationName = "triangulo")
    public double triangulo(
            
            @WebParam(name = "base") double base,
            @WebParam(name = "altura") double altura) {
        return calculadoraAreaLocal.triangulo(base, altura);
    }
   @WebMethod(operationName = "circulo")
    public double circulo(
            
            @WebParam(name = "radio") double radio) {
        return calculadoraAreaLocal.circulo(radio);
    }
    
    
    
}
