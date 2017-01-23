/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Esteban Pastelín
 */
public class LoginDialog extends JFrame {
    
    private JLabel lblNombre;
    private JLabel lblPass;
    private JLabel lblRol;
    private JTextField txtNombre;
    private JPasswordField pass;
    private JComboBox combo;
    private JButton btnAceptar;
    private JButton btnCancelar;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel pnlBotones;
    
    LoginDialog() {
        
        super( "Login" );
        super.setSize(350, 200);
        super.setLayout( new BorderLayout() );
        super.setLocation(500, 250);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] rol = {"alumno", "docentes"};   
        
        lblNombre = new JLabel ("      Usuario:   ");
        lblPass = new JLabel ("Contraseña :");         
        lblRol = new JLabel(" Rol :");
        
        txtNombre = new JTextField(15);
        pass = new JPasswordField(15);
        combo = new JComboBox(rol);
               
        panel1 = new JPanel();
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        
        panel2 = new JPanel();
        panel2.add(lblPass);
        panel2.add(pass);
        
        panel3 = new JPanel();
        panel3.add(lblRol);
        panel3.add(combo);
        
        panel4 = new JPanel();
        panel4.setLayout( new BorderLayout() );
        panel4.add(panel2, BorderLayout.NORTH);
        panel4.add(panel3, BorderLayout.CENTER);
        
        panel5 = new JPanel();
        panel5.add(panel1);
        panel5.add(panel4);
        
        btnAceptar = new JButton( " Aceptar " );
        btnAceptar.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                if ( txtNombre.getText().equals( "Esteban" ) && pass.getText().equals("esteban123") ) {                   
                    Ventanas v = new Ventanas();                    
                                
            }else if (txtNombre.getText().equals( "Karimnot" ) && pass.getText().equals("karimnot123")) {
                       Ventanas v = new Ventanas();                    

            }
            }
            });
        
        btnCancelar = new JButton( " Cancelar " );
        btnCancelar.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {    
                dispose();             
            }
        });
        
        pnlBotones = new JPanel();
        pnlBotones.add(btnAceptar);
        pnlBotones.add(btnCancelar);
        
        super.add(panel5, BorderLayout.CENTER);
        super.add(pnlBotones, BorderLayout.SOUTH);
        
        super.setVisible(true);
        super.setResizable(false);
        
    }
    
    
}
