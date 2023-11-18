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
public class ValueAdapter implements Subscriber<Integer>
{
    private Flow.Subscription subscription;
    private final MainWindow view;
    private final WuerfelModel model;
    
    public ValueAdapter(MainWindow viewInp, WuerfelModel modelInp)
    {
        view = viewInp;
        model = modelInp;
    }

    public void subscribe()
    {
        model.addValueObserver(this);
    }
    
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(Integer item) {
        view.getLblNumber().setText(String.valueOf(item));
        subscription.request(1);
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
