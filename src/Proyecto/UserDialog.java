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
public class UserDialog extends JFrame {
    
    private JPanel panelArriba;
    private JPanel panelAbajo;
    private JPanel panel1, panel2, panel3;
    private JPanel panel4, panel5;
    private JLabel lblnombre, lblnick, lblrol, lblpermitido;
    private JComboBox combo;
    private JButton btnNuevo, btnModificar, btnBloquear, btnAceptar, btnCancelar;
    private JTextField txt1, txt2;
    private JCheckBox check;
    
    public UserDialog(){
        
        super("UsuariosDialog");
        super.setSize(400, 220);
        super.setLayout( new BorderLayout() );
        super.setLocation(500, 220);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
 
        panelArriba = new JPanel();
        panelArriba.setLayout( new BorderLayout() );

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        lblnombre = new JLabel("Nombre:");
        txt1 = new JTextField(25);
        panel1.add(lblnombre);
        panel1.add(txt1);
        
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        lblnick = new JLabel("Nickname:");
        txt2 = new JTextField(18);
        panel2.add(lblnick);
        panel2.add(txt2);
        
        panel3 = new JPanel();
//        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        combo = new JComboBox();
        lblrol = new JLabel("Rol:");
        panel3.add(lblrol);
        panel3.add(combo);
        
//        panelArriba.setBackground(Color.red);
        panelArriba.add(panel1);
        panelArriba.add(panel2);
        panelArriba.add(panel3);
        
//        panel1.setBackground(Color.blue);
//        panel2.setBackground(Color.YELLOW);
//        panel3.setBackground(Color.CYAN);

        panelArriba.add(panel1, BorderLayout.NORTH);
        panelArriba.add(panel2, BorderLayout.CENTER);
        panelArriba.add(panel3, BorderLayout.SOUTH);

//        panelArriba.setLayout(new FlowLayout(FlowLayout.LEFT));
               
        panelAbajo = new JPanel();   
        panelAbajo.setLayout( new BorderLayout() );

        btnAceptar = new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(

        new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                dispose();
            } 
        }
        );
        
        panel4 = new JPanel();
        
        check = new JCheckBox();
        lblpermitido = new JLabel("Permitido");
//        panel4.setBackground(Color.orange);
        panel4.add(check);
        panel4.add(lblpermitido);
        
        panel5 = new JPanel();
//        panel5.setBackground(Color.PINK);
        panel5.add(btnAceptar);
        panel5.add(btnCancelar);
        panel5.setLayout(new FlowLayout(FlowLayout.RIGHT));

//        panelAbajo.setBackground(Color.green);
        panelAbajo.add(panel4);
        panelAbajo.add(panel5);
        
        panelAbajo.add(panel4, BorderLayout.CENTER);
        panelAbajo.add(panel5, BorderLayout.SOUTH);
      
        
        super.add(panelArriba);
        super.add(panelAbajo);
        super.add(panelArriba, BorderLayout.CENTER);
        super.add(panelAbajo, BorderLayout.SOUTH);
        
        super.setVisible(true);
        
    }
    
}
