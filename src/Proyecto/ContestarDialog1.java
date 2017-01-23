/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Esteban Pastelín
 */
public class ContestarDialog1 extends JFrame {
    private JPanel panelArriba;
    private JPanel panelAbajo;
    private JPanel panel1, panel2, panel3, panel4, panel5;
    private JButton btnCancelar, btnComenzar;
    private JLabel txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10;
    
    public ContestarDialog1(){
        super("ContestarDialog-1");
        super.setSize(400, 180);
        super.setLayout( new BorderLayout() );
        super.setLocation(500, 250);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panelArriba = new JPanel();
        panelArriba.setLayout( new BorderLayout() );

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        txt1 = new JLabel("Examen:");
        txt2 = new JLabel("Programacion");
        panel1.add(txt1);
        panel1.add(txt2);
        
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        txt3 = new JLabel("Tema:");
        txt4 = new JLabel("Ciclos");
        panel2.add(txt3);
        panel2.add(txt4);
        
        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        txt5 = new JLabel("Intento No:");
        txt6 = new JLabel("1");
        txt7 = new JLabel("         Total Preguntas:");
        txt8 = new JLabel("40");
        txt9 = new JLabel("         Reactivos:");
        txt10 = new JLabel("15");
        panel3.add(txt5);
        panel3.add(txt6);
        panel3.add(txt7);
        panel3.add(txt8);
        panel3.add(txt9);
        panel3.add(txt10);
        
        panelArriba.add(panel1);
        panelArriba.add(panel2);
        panelArriba.add(panel3);
       
        panelArriba.add(panel1, BorderLayout.NORTH);
        panelArriba.add(panel2, BorderLayout.CENTER);
        panelArriba.add(panel3, BorderLayout.SOUTH);

               
        panelAbajo = new JPanel();   
        panelAbajo.setLayout( new BorderLayout() );

        btnComenzar = new JButton("Comenzar");
        btnComenzar.addActionListener(

        new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                ContestarDialog2 cd2 = new ContestarDialog2();
            } 
        }
        );
        
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(

        new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                dispose();
            } 
        }
        );
           
        panel5 = new JPanel();
        panel5.add(btnCancelar);
        panel5.add(btnComenzar);
        panel5.setLayout(new FlowLayout(FlowLayout.RIGHT));

        panelAbajo.add(panel5);
        
        panelAbajo.add(panel5, BorderLayout.SOUTH);
      
        super.add(panelArriba);
        super.add(panelAbajo);
        super.add(panelArriba, BorderLayout.CENTER);
        super.add(panelAbajo, BorderLayout.SOUTH);
        
        super.setVisible(true);
        
    }
    
}

