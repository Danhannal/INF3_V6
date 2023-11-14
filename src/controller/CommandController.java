/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MainWindow;

/**
 *
 * @author MOD-USER
 */
public class CommandController implements ActionListener
{
    MainWindow view;
    Model model;
    
    public CommandController(MainWindow viewInp, Model modelInp)
    {
        view = viewInp;
        model = modelInp;
    }
    
    public void registerEvents()
    {
        
    }
    
    public void registerCommands()
    {
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
