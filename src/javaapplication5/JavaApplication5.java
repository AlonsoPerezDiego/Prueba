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
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce base"));
        double altura= Double.parseDouble(JOptionPane.showInputDialog("Introduce altura"));
        JOptionPane.showMessageDialog(null, "El área del triángulo es igual a " + base+altura/2 + "cm^2.");
    }
    
}
