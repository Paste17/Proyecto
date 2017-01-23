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
public class PreguntasDialog extends JFrame {
    
        private JPanel panelArriba, panelCentro, panelAbajo;
        private JPanel panel1, panel2, panel3;
        private JLabel lblcorrecta, lblincorrecta1, lblincorrecta2, lblincorrecta3;
        private JTextField txt1, txt2, txt3, txt4;
        private JButton btnCancelar, btnanterior, btnsiguiente, btnfinalizar;

        public PreguntasDialog(){
            
        super("PreguntasDialog");
        super.setSize(380, 280);
        super.setLayout( new BorderLayout() );
        super.setLocation(500, 200);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
         
        lblcorrecta = new JLabel("   Correcta");
        txt1 = new JTextField(20);
        panelArriba = new JPanel();
        panelArriba.add(lblcorrecta);
        panelArriba.add(txt1);
        panelArriba.setPreferredSize(new Dimension(super.getWidth(),60));

//        panelArriba.setLayout(new FlowLayout(FlowLayout.LEFT));

//        panelArriba.setLayout( new BorderLayout() );
        
        panelCentro = new JPanel();
        panelCentro.setLayout( new BorderLayout() );

        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(super.getWidth(),40));
        
        lblincorrecta1 = new JLabel("Incorrecta");
        txt2 = new JTextField(20);
        panel1.add(lblincorrecta1);
        panel1.add(txt2);
//        panel1.setBackground(Color.red);

        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(super.getWidth(),40));      
        lblincorrecta2 = new JLabel("Incorrecta");
        txt3 = new JTextField(20);
        panel2.add(lblincorrecta2);
        panel2.add(txt3);
//        panel2.setBackground(Color.yellow);

        panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(super.getWidth(),40));
        lblincorrecta3 = new JLabel("Incorrecta");
        txt4 = new JTextField(20);
        panel3.add(lblincorrecta3);
        panel3.add(txt4);
//        panel3.setBackground(Color.BLUE);

//        panelCentro.setBackground(Color.red);
        panelCentro.add(panel1, BorderLayout.NORTH);
        panelCentro.add(panel2, BorderLayout.CENTER);
        panelCentro.add(panel3, BorderLayout.SOUTH);


//        panelCentro.setLayout( new BorderLayout() );

        panelAbajo = new JPanel();
        
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(

        new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                dispose();
            } 
        }
        );
        
        btnanterior = new JButton("Anterior");
        btnsiguiente = new JButton("Siguiente");
        btnfinalizar = new JButton("Finalizar");
        
        panelAbajo.setPreferredSize(new Dimension(super.getWidth(),60));
//        panelAbajo.setBackground(Color.green);
        panelAbajo.add(btnCancelar);        
        panelAbajo.add(btnanterior);
        panelAbajo.add(btnsiguiente);
        panelAbajo.add(btnfinalizar);

        
        super.add(panelArriba, BorderLayout.NORTH);
        super.add(panelCentro, BorderLayout.CENTER);
        super.add(panelAbajo, BorderLayout.SOUTH);

        
        super.setVisible(true);
        }
}
