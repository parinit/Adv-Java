/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.un.gui;

import java.awt.Frame;

/**
 *
 * @author Parinit
 * Basics of Java GUI
 */
public class Frame01 {
    public static void main(String[] args) {
        Frame f = new Frame("My Frame");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
