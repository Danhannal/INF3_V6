/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Commands;

import controller.CommandInterface;
import view.MainWindow;
import versuch_6.*;

/**
 *
 * @author MOD-USER
 */
public class StartCommand implements CommandInterface
{
    private final MainWindow view;
    private final WuerfelModel model;
    
    public StartCommand(MainWindow viewInp, WuerfelModel modelInp)
    {
        view = viewInp;
        model = modelInp;
    }
    
    @Override
    public void execute() {
        view.getBtnStart().setEnabled(false);
        view.getBtnStop().setEnabled(true);
        
        model.start();
    }
    
}
