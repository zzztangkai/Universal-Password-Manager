/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upm;

import javax.swing.JFrame;

/**
 *
 * @author Kai_Tang
 */
public class UPM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        welcomepage welcome = new welcomepage();
        //welcome.setExtendedState(welcome.getExtendedState()|JFrame.MAXIMIZED_BOTH);
        welcome.setVisible(true);
        
    }
    
}
