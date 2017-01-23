/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author Esteban Pastelín
 */
public class Panel1 extends JPanel{
     JButton buscar = new JButton("Buscar");
     JTextField txt = new JTextField(25);
     JLabel label = new JLabel("Buscar examen:");
    
    public Panel1(){
        super.setLayout(new FlowLayout(FlowLayout.LEFT));
        super.add(label);
        super.add(txt);
        super.add(buscar);
       
        

        
    }
}
