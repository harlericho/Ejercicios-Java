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
public class Numeros {
    private Double num1;
    private Double num2;
    
    //constructor vacio: 
    public Numeros() {
    }
    
    //constructor:
    public Numeros(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //get y set:

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }
    

}
