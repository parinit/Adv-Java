/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.un.gui;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;

/**
 *
 * @author Parinit
 * 
 */
public class Frame02 extends java.awt.Frame implements java.awt.event.ActionListener{

    private java.awt.Button button1;
    
    public Frame02() {
        setSize(400, 400);
        setLayout(null);
        button1 = new java.awt.Button("Click Me");
        button1.setBounds(100, 100, 80, 30);
        add(button1);
        button1.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    
    public static void main(String[] args) {
        new Frame02().setVisible(true);
    }
    
}
