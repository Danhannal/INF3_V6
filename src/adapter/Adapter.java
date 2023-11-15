/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

import java.util.Observable;
import java.util.Observer;
import view.MainWindow;
import versuch_6.*;

/**
 *
 * @author MOD-USER
 */
public class Adapter implements Observer
{
    private final MainWindow view;
    private final WuerfelModel model;
    
    public Adapter(MainWindow viewInp, WuerfelModel modelInp)
    {
        view = viewInp;
        model = modelInp;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
