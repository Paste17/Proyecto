/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Esteban Pastelín
 */
public class ContestarDialog3 extends JFrame{
    
    private JPanel panelArriba;
    private JPanel panelAbajo;
    private JPanel panel1, panel2, panel3, panel4, panel5;
    private JButton btnAceptar;
    private JLabel txt1, txt3, txt5, txt6, txt7, txt8, txt9, txt10;
    
    public ContestarDialog3(){
        super("ContestarDialog-1");
        super.setSize(300, 200);
        super.setLayout( new BorderLayout() );
        super.setLocation(500, 250);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panelArriba = new JPanel();
        panelArriba.setLayout( new BorderLayout() );

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        txt1 = new JLabel("Has finalizado tu examen:");
        panel1.add(txt1);
        
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        txt3 = new JLabel("8.3");
        panel2.add(txt3);
        
        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        txt7 = new JLabel("Calificación");
        panel3.add(txt7);
        
        
        panelArriba.add(panel1);
        panelArriba.add(panel2);
        panelArriba.add(panel3);
       
        panelArriba.add(panel1, BorderLayout.NORTH);
        panelArriba.add(panel2, BorderLayout.CENTER);
        panelArriba.add(panel3, BorderLayout.SOUTH);

               
        panelAbajo = new JPanel();   
        panelAbajo.setLayout( new BorderLayout() );

        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(

        new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                dispose();
            } 
        }
        );
           
        panel5 = new JPanel();
        panel5.add(btnAceptar);
        panel5.setLayout(new FlowLayout(FlowLayout.CENTER));

        panelAbajo.add(panel5);
        
        panelAbajo.add(panel5, BorderLayout.SOUTH);
      
        super.add(panelArriba);
        super.add(panelAbajo);
        super.add(panelArriba, BorderLayout.CENTER);
        super.add(panelAbajo, BorderLayout.SOUTH);
        
        super.setVisible(true);
        
    }
    
}

