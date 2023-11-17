/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import adapter.Adapter;
import controller.Commands.StartCommand;
import controller.Commands.StopCommand;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MainWindow;
import versuch_6.*;

/**
 *
 * @author MOD-USER
 */
public class CommandController implements ActionListener
{
    MainWindow view;
    WuerfelModel model;
    Adapter observer;
    CommandInvoker invoker;
    
    public CommandController(MainWindow viewInp, WuerfelModel modelInp, Adapter observerInp)
    {
        view = viewInp;
        model = modelInp;
        observer = observerInp;
        invoker = new CommandInvoker();
    }
    
    public void registerEvents()
    {
        view.getBtnStart().addActionListener(this);
        view.getBtnStop().addActionListener(this);
        //model.addObserver(observer);  //model must be Observable for this to work
    }
    
    public void registerCommands()
    {
        invoker.addCommand(view.getBtnStart(), new StartCommand(view, model));
        invoker.addCommand(view.getBtnStop(), new StopCommand(view, model));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        var key = (Component)e.getSource();
        invoker.executeCommand(key);
    }
    
}
