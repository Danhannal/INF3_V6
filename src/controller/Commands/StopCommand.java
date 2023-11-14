/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Commands;

import controller.CommandInterface;
import view.MainWindow;

/**
 *
 * @author MOD-USER
 */
public class StopCommand implements CommandInterface
{
    private final MainWindow view;
    private final WuerfelModel model;
    
    public StopCommand(MainWindow viewInp, WuerfelModel model)
    {
        view = viewInp;
        model = modelInp;
    }
    
    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
