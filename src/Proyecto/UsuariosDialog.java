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
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author Esteban Pastelín
 */
public class UsuariosDialog extends JFrame{
    
    private JPanel panelArriba;
    private JPanel panelAbajo;
    private JButton btnNuevo, btnModificar, btnBloquear;
    
    
      public UsuariosDialog(){
        super("UsuariosDialog");
        super.setSize(550, 400);
        super.setLayout( new BorderLayout() );
        super.setLocation(400, 200);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panelArriba = new JPanel();
        btnNuevo = new JButton("Aceptar");
        btnModificar = new JButton("Modificar");
        btnBloquear = new JButton("Bloquear/Desbloquear");

//        panelArriba.setBackground(Color.red);
        panelArriba.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelArriba.add(btnNuevo);
        panelArriba.add(btnModificar);
        panelArriba.add(btnBloquear);

               
        panelAbajo = new JPanel();       
//        panelAbajo.setBackground(Color.green);
      
        
        super.add(panelArriba);
        super.add(panelAbajo);
        super.add(panelArriba, BorderLayout.NORTH);
        super.add(panelAbajo, BorderLayout.SOUTH);
        
        
        super.setVisible(true);
}
}
    

