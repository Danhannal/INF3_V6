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
  public WuerfelModel()
  {
   runningThread = new WuerfelThread();
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
    //V1 start publishing thread

    //V2 create thread to run in
    thd = new Thread(runningThread);
    thd.start();
    runningThread.statusPublisher.submit(true);
    //V3 notify to exit wait state of thread
  }
    public void stop()
  {
    //V1 Stop publishing
    runningThread.statusPublisher.submit(false);
    runningThread.running = false;
    //V2 destroy thread
    //V3 wait thread
  }
}
