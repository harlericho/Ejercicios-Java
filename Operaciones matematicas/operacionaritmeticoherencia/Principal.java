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
public class Principal {
    public static void main(String[] args){
        Operaciones p = new Operaciones();
        p.setNum1(2.0);
        p.setNum2(3.0);
        p.operacion();
        p.resultado();
    }
}
