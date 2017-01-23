/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author Esteban Pastelín
 */
public class PanelTrabajo extends JPanel {
    
    private JPanel panel;
    private JPanel panelHerramientas;
    private JPanel panelTrab;
    private JToolBar toolbar;
    private JButton boton, boton2, boton3, boton4, boton5, boton6,boton7,boton8 ;
    
    public PanelTrabajo(){
        panelHerramientas = new JPanel();
                
        boton = new JButton(new ImageIcon("document.PNG"));
        boton.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                 ExamenDialog ex = new ExamenDialog();
            } 
        }
        );
        boton6 = new JButton(new ImageIcon("user.PNG"));
        boton6.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                UsuariosDialog us = new UsuariosDialog();
            } 
        }
        );
        boton2 = new JButton(new ImageIcon("add.PNG"));
        boton3 = new JButton(new ImageIcon("edit.PNG"));
        boton3.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                ContestarDialog1 con = new ContestarDialog1();
            } 
        }
        );
        boton4 = new JButton(new ImageIcon("information.PNG"));
        boton4.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                JOptionPane.showMessageDialog( PanelTrabajo.this,String.format(
                    "ULSA OAXACA\n"
                            + "Ing. en Software\n"
                            + "Alumno:\n"
                            + "ESTEBAN PASTELIN SANTIAGO"));
            } 
        }
        );
        boton5 = new JButton(new ImageIcon("delete.PNG"));
//         boton5.addActionListener(new ActionListener() {
//            public void actionPerformed( ActionEvent event ) {
//                dispose();
//            } 
//        }
//        );

        boton7 = new JButton(new ImageIcon("lolo.PNG"));
        boton7.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                VerDialog v = new VerDialog();
            } 
        }
        );
        boton8 = new JButton(new ImageIcon("plusone.PNG"));
        boton8.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                IntentosDialog i = new IntentosDialog();
            }
        }        
        );

        
        toolbar = new JToolBar();
        toolbar.add(boton6);
        toolbar.add(boton);
        toolbar.add(boton2);
        toolbar.add(boton3);
        toolbar.add(boton7);
        toolbar.add(boton8);
        toolbar.add(boton4);
        toolbar.add(boton5);
        

        panelHerramientas.add(toolbar);
        
        panelHerramientas.setLayout(new BorderLayout());
        panelHerramientas.add(toolbar, BorderLayout.WEST);
        
        
        
        
        panelTrab = new JPanel();
//        panelTrab.setBackground(Color.green);

        super.add(panelHerramientas);
        super.add(panelTrab);
        super.setLayout(new BorderLayout());
        super.add(panelHerramientas, BorderLayout.NORTH);
        super.add(panelTrab, BorderLayout.CENTER);
        super.setBackground(Color.LIGHT_GRAY);
    }
}
