/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Esteban Pastelín
 */
public class Ventanas extends JFrame {
    private PanelTrabajo pnlTrab;
    private Panel1 pnl1;

    public Ventanas() {
        MenuFrame menuFrame = new MenuFrame();
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setLayout(new BorderLayout());
        menuFrame.setLocation(200, 50);
        menuFrame.setSize(1000, 600);
      

        pnlTrab = new PanelTrabajo();
        menuFrame.add(pnlTrab);
        menuFrame.add(pnlTrab, BorderLayout.CENTER);
        
        pnl1 = new Panel1();
        menuFrame.add(pnl1, BorderLayout.SOUTH);

         
        
        menuFrame.setVisible(true);

    }
}
