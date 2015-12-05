/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author GerlinOTorresS
 */
public class InterpreteEspanol implements Interprete{
    private String nombre;

    @Override
    public void saludar() {
        System.out.println("Hola"); 
    }

    @Override
    public void despedir() {
        System.out.println("Hasta luego");
    }
    
}
