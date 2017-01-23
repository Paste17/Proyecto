/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Esteban Pastelín
 */
public class MenuFrame extends JFrame{

    
    public MenuFrame(){
        super("Ordinario PAINT");
        JMenu sistema = new JMenu("Sistema");
        JMenu examen = new JMenu("Examen");
        JMenu alumnos = new JMenu("Alumnos"); 
        JMenu ayuda = new JMenu("Ayuda");
        
        JMenuItem usuarios = new JMenuItem( "Usuarios" );
        sistema.add( usuarios );
        usuarios.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_DOWN_MASK));
        usuarios.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                UsuariosDialog us = new UsuariosDialog();
            } 
        }
        );
        
        JMenuItem salir = new JMenuItem( "Salir" );
        sistema.add( salir );
        salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
        salir.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                dispose();
            } 
        }
        );

        
        JMenuItem crearExamen = new JMenuItem( "Crear Examen" );
        examen.add( crearExamen );
        crearExamen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2,0));
         crearExamen.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                 ExamenDialog ex = new ExamenDialog();
            } 
        }
        );
         
        JMenuItem modificar = new JMenuItem( "Modificar" );
        examen.add( modificar );
        modificar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_DOWN_MASK));

        
        JMenuItem contestar = new JMenuItem("Contestar");
        alumnos.add(contestar);
        contestar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,0));     
        contestar.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                ContestarDialog1 con = new ContestarDialog1();
            } 
        }
        );
         
        JMenuItem calificacion = new JMenuItem("Ver Calificacion");
        alumnos.add(calificacion);
        calificacion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12,0));
        
        calificacion.addActionListener(

        new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                VerDialog v = new VerDialog();
            } 
        }
        );
        
        JMenuItem intentos = new JMenuItem("No de Intentos");
        alumnos.add(intentos);
        intentos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,0));
        
        intentos.addActionListener(
        new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                IntentosDialog i = new IntentosDialog();
            }
        }        
        );

        JMenuItem contenido = new JMenuItem ("Contenido");
        ayuda.add(contenido);
        contenido.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1,0));
        JMenuItem acerca = new JMenuItem( "Acerca de");
        ayuda.add(acerca);
        acerca.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.CTRL_DOWN_MASK));

        acerca.addActionListener(

        new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                JOptionPane.showMessageDialog( MenuFrame.this,String.format(
                    "ULSA OAXACA\n"
                            + "Ing. en Software\n"
                            + "Alumno:\n"
                            + "ESTEBAN PASTELIN SANTIAGO"));
            } 
        }
        );
        
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(sistema);
        bar.add(examen);
        bar.add(alumnos);
        bar.add(ayuda);
    }
}
