/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author Esteban Pastelín
 */
public class IntentosDialog extends JFrame{
    
    private JPanel panelArriba;
    private JPanel panelAbajo;
    private JButton aceptar;
    
    public IntentosDialog(){
        
        super("IntentosDialog");
        super.setSize(350, 350);
        super.setLayout( new BorderLayout() );
        super.setLocation(500, 150);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panelArriba = new JPanel();
//        panelArriba.setBackground(Color.red);
        
        panelAbajo = new JPanel();
        aceptar  = new JButton("Aceptar");
        aceptar.addActionListener(

        new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                dispose();
            } 
        }
        );
        
//        panelAbajo.setBackground(Color.green);
        panelAbajo.add(aceptar);
      
        
        super.add(panelArriba);
        super.add(panelAbajo);
        super.add(panelArriba, BorderLayout.NORTH);
        super.add(panelAbajo, BorderLayout.SOUTH);
        
        
        super.setVisible(true);
}
}
