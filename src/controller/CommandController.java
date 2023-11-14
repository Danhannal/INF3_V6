/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.Commands.StartCommand;
import controller.Commands.StopCommand;
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
    WuerfelModel model;
    CommandInvoker invoker;
    
    public CommandController(MainWindow viewInp, WuerfelModel modelInp)
    {
        view = viewInp;
        model = modelInp;
        invoker = new CommandInvoker();
    }
    
    public void registerEvents()
    {
        view.getBtnStart().addActionListener(this);
        view.getBtnStop().addActionListener(this);
    }
    
    public void registerCommands()
    {
        invoker.addCommand(view.getBtnStart(), new StartCommand());
        invoker.addCommand(view.getBtnStop(), new StopCommand());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}