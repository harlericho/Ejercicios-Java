/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionaritmeticoherencia;

/**
 *
 * @author Harlericho
 */
public class Operaciones extends Numeros{
    private Double suma;
    
    //constrcutor vacio:
    public Operaciones() {
    }
    
    //constructor:
    public Operaciones(Double suma, Double num1, Double num2) {
        super(num1, num2);
        this.suma = suma;
    }
    
    //get y set:

    public Double getSuma() {
        return suma;
    }

    public void setSuma(Double suma) {
        this.suma = suma;
    }
    
    //metodo para funcion:
    public void operacion(){
    suma = getNum1() + getNum2();
    }
    
    //imprimir:
    //metodo imprimir
    public void resultado(){
    System.out.println("-------------------------------");
    System.out.println("Primer Numero Ingresado es :"+getNum1());
    System.out.println("Segundo Numero Ingresado es :"+getNum2());
    System.out.println();
    System.out.println("Resultado es: "+suma);
    }
    
}
