/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package versuch_6;

import adapter.Adapter;
import controller.CommandController;
import view.*;

/**
 *
 * @author MOD-USER
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    
    public Start()
    {
        var view = new MainWindow();
        var model = new WuerfelModel();
        var observer = new Adapter(view, model);
        var controller = new CommandController(view, model, observer);
        controller.registerCommands();
        controller.registerEvents();
        view.setTitle("Digitaler Würfel");
        view.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Start();
    }
    
}
