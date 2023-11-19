/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscriber;
import view.MainWindow;
import versuch_6.*;

/**
 *
 * @author MOD-USER
 */
public class StateAdapter implements Subscriber<Boolean>
{
    private Flow.Subscription subscription;
    private final MainWindow view;
    private final WuerfelModel model;
    
    public StateAdapter(MainWindow viewInp, WuerfelModel modelInp)
    {
        view = viewInp;
        model = modelInp;
    }
    
    public void subscribe()
    {
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void onNext(Boolean item) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void onError(Throwable throwable) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void onComplete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
