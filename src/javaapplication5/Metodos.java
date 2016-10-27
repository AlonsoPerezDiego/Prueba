/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Metodos {
    
    private double lado;
    
    public Metodos(){
        
    }
    
    public Metodos(double l){
        
        lado = l;

    }
    
    public void setUnidades(){
        
        lado =  Double.parseDouble(JOptionPane.showInputDialog("Introduce lado"));
        
        while(lado<=0){
            
            lado =  Double.parseDouble(JOptionPane.showInputDialog("Introduce base"));

            
        }
    }
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "El área del tríangulo es de " + (Math.pow(lado, 2)) + "cm^2");
    }
    
}
