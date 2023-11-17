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
  public WuerfelModel()
  {
    runningThread = new WuerfelThread();
    
  }
  
  public void addObserver(Flow.Subscriber<Integer> subscriber)
  {
    runningThread.addValueSubscriber(subscriber);
  }
  public void start()
  {
    //V1 start publishing thread
    runningThread.statusPublisher.submit(true);
    runningThread.running = true;
    //V2 create thread to run in
    
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
