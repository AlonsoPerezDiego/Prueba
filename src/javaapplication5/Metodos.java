/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
class Metodos {
    
       
    private double base, altura;
    
    public Metodos(){
        
    }
    
   public Metodos(double l, double k){
       
        base = l;
        altura = k;

    }
    
    public void setUnidades(){
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Introduce base"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce áltura"));
        
        while(base<=0|altura<=0){
            
            base =  Double.parseDouble(JOptionPane.showInputDialog("Introduce base"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce áltura"));
            
        }
    }
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "El área del tríangulo es de " + (base*altura/2) + "cm^2");
}
}
