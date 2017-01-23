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
import javax.swing.*;

/**
 *
 * @author Esteban Pastelín
 */
public class VerDialog extends JFrame{
    private JPanel panel;
    private JPanel pnlCerrar;
    private JButton cerrar;
    private JPanel pnl1;
    private JPanel pnl2;
    private JPanel pnl3;
    private JLabel txt1;
    private JLabel txt2;
    private JLabel txt3;
    
    public VerDialog(){
        super( "VerDialog" );
        super.setSize(350, 250);
        super.setLayout( new BorderLayout() );
        super.setLocation(500,200);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        pnl1 = new JPanel();
        txt1 = new JLabel("Tu Calificación es:");
        pnl1.add(txt1);
        
        pnl2 = new JPanel();
        txt2 = new JLabel("8.8");
        pnl2.add(txt2);
        
        pnl3 = new JPanel();
        txt3 = new JLabel("Calificación");
        pnl3.add(txt3);
        
        panel = new JPanel();
        panel.add(pnl1);
        
        panel.add(pnl2);
        panel.add(pnl3);       

        cerrar = new JButton("Cerrar");
        cerrar.addActionListener(

        new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                dispose();
            } 
        }
        );
             
        pnlCerrar = new JPanel();
        pnlCerrar.add(cerrar);
        
        super.add(panel);
        super.add(pnlCerrar, BorderLayout.SOUTH);

        super.setVisible(true);
    }
}

