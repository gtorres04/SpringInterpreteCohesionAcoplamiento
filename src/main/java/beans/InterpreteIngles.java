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
public class InterpreteIngles implements Interprete{

    @Override
    public void saludar() {
        System.out.println("Hello"); 
    }

    @Override
    public void despedir() {
        System.out.println("Bye");
    }
    
}
