/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wat2cook;

import javax.swing.JFrame;

/**
 *
 * @author marco
 */
public class Wat2cook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login login =new Login();
        login.setTitle("Wat2Cook");
        login.setVisible(true);
        login.setBounds(10,10,300,420);
        //login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setResizable(false);
        
        
     
    }
    
}
