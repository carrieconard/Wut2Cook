﻿//Importing all necessary Packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Creating LoginFrame class
public class LoginFrame extends JFrame implements ActionListener {


    //Creating constructor of LoginFrame() class
    LoginFrame()
    {

    }

    //Overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
 
public class Login {
    public static void main(String[] a){
        //Creating object of LoginFrame class and setting some of its properties
        LoginFrame frame=new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10,10,370,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
 
    }
 
}