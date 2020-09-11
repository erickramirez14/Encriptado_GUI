/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.clonado.pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PruebaTransform {

  
    public static void main(String[] args) {
        Marco marcoTexto = new Marco();
        
        marcoTexto.setVisible(true);
        
        marcoTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class Marco extends JFrame{
    public Marco(){
        setTitle("Programa para Invertir");
        
        setBounds(700, 300, 500, 300);
        
        Botones invertir = new Botones();
        
        add(invertir);
    }
}

class Botones extends JPanel{
    public Botones(){
    JLabel texto = new JLabel("Cadena: ");
    
    add(texto);
    
    cadena = new JTextField(20);
    
    add(cadena);
    
    System.out.println(cadena.getText());
    
    JButton inv = new JButton("Invertir");
    
    Texto event = new Texto();
    
    inv.addActionListener(event);
    
    add(inv);
    }
    
    private class Texto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String codigo= cadena.getText();
            Transform t = new Transform();
            t.transform(codigo);
        }
    }
    private JTextField cadena;
}


