/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package versuch_6;

import java.util.concurrent.Flow;


/**
 *
 * @author Kieran
 */
public class WuerfelModel// implements Runnable 
{
  private WuerfelThread runningThread;
  private Thread thd;
  private boolean threadRunning = false;
  public WuerfelModel()
  {
    runningThread = new WuerfelThread();

    //stop();
    //runningThread.stop();
  }
  
  public void addObserver(Flow.Subscriber<Integer> subscriber)
  {
    runningThread.addValueSubscriber(subscriber);
  }
  public void addValueObserver(Flow.Subscriber<Integer> subscriber)
  {
    runningThread.addValueSubscriber(subscriber);
  }
  
  public void addStateObserver(Flow.Subscriber<Boolean> subscirber)
  {
      runningThread.addStatusSubscriber(subscirber);
  }
  
  public void start()
  {
    if(threadRunning == false)
    {
    thd = new Thread(runningThread);
    thd.start();
    threadRunning = true;
    }
    else{    runningThread.start();}
    //V1 start publishing thread
    //runningThread.statusPublisher.submit(true);

    //V2 create thread to run in
    //V3 notify to exit wait state of thread
  }
    public void stop()
  {
    //V1 Stop publishing
    //runningThread.statusPublisher.submit(false);
    runningThread.stop();
    //V2 destroy thread
    //V3 wait thread
  }
}
