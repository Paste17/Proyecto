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
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Esteban Pastelín
 */
public class ExamenDialog extends JFrame {
    
    private JPanel panelArriba, panelCentro, panelAbajo;
    private JPanel panel1, panel2, panel3, panel4, panel5, panel6;
    private JPanel pnlmateria, pnlparcial, pnltema, pnltotal, pnlpreguntas, pnlintentos;
    private JButton btnCancelar, btnAceptar;
    private JLabel lblmateria, lblparcial, lbltema, lbltotal, lblpreguntas, lblintentos;
    private JTextField txt1, txt2, txt3;
    
    public ExamenDialog(){
        
        super("ExamenDialog");
        super.setSize(450, 240);
        super.setLayout( new BorderLayout() );
        super.setLocation(460, 250);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panelArriba = new JPanel();
        panelArriba.setLayout( new BorderLayout() );
//        panelArriba.setPreferredSize(new Dimension(super.getWidth(),100));
        
        pnlmateria = new JPanel();
        pnlmateria.setLayout(new FlowLayout(FlowLayout.LEFT));

        pnlparcial = new JPanel();
        pnlparcial.setLayout(new FlowLayout(FlowLayout.LEFT));

        pnltema = new JPanel();
        pnltema.setLayout(new FlowLayout(FlowLayout.LEFT));

        
        lblmateria = new JLabel("                          Materia");
        txt1 = new JTextField(20);
        pnlmateria.add(lblmateria);
        pnlmateria.add(txt1);
        
        lblparcial = new JLabel("                           Parcial");
        txt2 = new JTextField(5);
        pnlparcial.add(lblparcial);
        pnlparcial.add(txt2);
        
        lbltema = new JLabel("                              Tema");
        txt3 = new JTextField(15);
        pnltema.add(lbltema);
        pnltema.add(txt3);
        
//        panelArriba.setBackground(Color.red);
        panelArriba.add(pnlmateria, BorderLayout.NORTH);
        panelArriba.add(pnlparcial, BorderLayout.CENTER);
        panelArriba.add(pnltema, BorderLayout.SOUTH);
        
        
        panelCentro  = new JPanel();
        panelCentro.setLayout( new BorderLayout() );

        pnltotal = new JPanel();
        pnltotal.setLayout(new FlowLayout(FlowLayout.LEFT));

        pnlpreguntas = new JPanel();
        pnlpreguntas.setLayout(new FlowLayout(FlowLayout.LEFT));

        pnlintentos = new JPanel();
        pnlintentos.setLayout(new FlowLayout(FlowLayout.LEFT));
       
        lbltotal = new JLabel("    Total de Preguntas");
        pnltotal.add(lbltotal);
        
        lblpreguntas = new JLabel("    Preguntas a realizar");
        pnlpreguntas.add(lblpreguntas);
        
        lblintentos = new JLabel("    Intentos permitidos");
        pnlintentos.add(lblintentos);
        
//        panelCentro.setBackground(Color.green);
        panelCentro.add(pnltotal, BorderLayout.NORTH);
        panelCentro.add(pnlpreguntas, BorderLayout.CENTER);
        panelCentro.add(pnlintentos, BorderLayout.SOUTH);
        
        panelAbajo = new JPanel();
        panelAbajo.setLayout(new FlowLayout(FlowLayout.RIGHT));
        btnCancelar = new JButton("Cancelar");
        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(

        new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                PreguntasDialog p = new PreguntasDialog();
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
        
//        panelAbajo.setBackground(Color.blue);
        panelAbajo.add(btnCancelar);
        panelAbajo.add(btnAceptar);
        
        
        super.add(panelArriba, BorderLayout.NORTH);
        super.add(panelCentro, BorderLayout.CENTER);
        super.add(panelAbajo, BorderLayout.SOUTH);
        
        super.setVisible(true);
    }
    
}
