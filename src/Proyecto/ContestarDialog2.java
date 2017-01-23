/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Esteban Pastelín
 */
public class ContestarDialog2 extends JFrame{
    private JPanel panelArriba;
    private JPanel panelAbajo;
    private JPanel panel1, panel2, panel3, panel4, panel5;
    private JButton btnContestar;
    private JPanel panelito;
    private JLabel txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10;
    private JCheckBox check1, check2, check3, check4;
    
    public ContestarDialog2(){
        super("ContestarDialog-2");
        super.setSize(350, 250);
        super.setLayout( new BorderLayout() );
        super.setLocation(500, 200);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panelArriba = new JPanel();
        panelArriba.setLayout( new BorderLayout() );

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        txt1 = new JLabel("Pregunta 1");
        panel1.add(txt1);
        
        panel2 = new JPanel();
        panel2.setBackground(Color.green);
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        txt3 = new JLabel("¿De qué color es el cielo?");
        panel2.add(txt3);
        
        panel3 = new JPanel();
       // panel3.setLayout( new BorderLayout() );
        panel3.setBackground(Color.red);
        panel3.setPreferredSize(new Dimension(panelArriba.getWidth(),120));
        
        check1 = new JCheckBox();
        check2 = new JCheckBox();
        check3 = new JCheckBox();
        check4 = new JCheckBox();
        
        panelito = new JPanel();
        
        panel3.add(check1);
        //panel3.add(panelito, BorderLayout.SOUTH);
               
        panelArriba.add(panel1);
        panelArriba.add(panel2);
        panelArriba.add(panel3);
       
        panelArriba.add(panel1, BorderLayout.NORTH);
        panelArriba.add(panel2, BorderLayout.CENTER);
        panelArriba.add(panel3, BorderLayout.SOUTH);

               
        panelAbajo = new JPanel();   
        panelAbajo.setLayout( new BorderLayout() );

        btnContestar = new JButton("Contestar");
                 
        panel5 = new JPanel();
        panel5.add(btnContestar);

        panelAbajo.add(panel5);
        
        panelAbajo.add(panel5, BorderLayout.SOUTH);
      
        super.add(panelArriba);
        super.add(panelAbajo);
        super.add(panelArriba, BorderLayout.CENTER);
        super.add(panelAbajo, BorderLayout.SOUTH);
        
        super.setVisible(true);
        
    }
    
}



