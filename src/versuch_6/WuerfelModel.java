/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package versuch_6;

import java.lang.System.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.SubmissionPublisher;

/**
 *
 * @author Kieran
 */
public class WuerfelModel// implements Runnable 
{
  private int runFrom;
  private int runTo;
  private int currentNumber;
  private boolean running;
  private ExecutorService eService;
  private SubmissionPublisher <Integer> numberPublisher;
  private SubmissionPublisher <Boolean> statusPublisher;
  public WuerfelModel()
  {
    runFrom = 1;
    runTo = 6;
    running = false;
    eService = Executors.newSingleThreadExecutor();
    numberPublisher = new SubmissionPublisher<>();
    statusPublisher = new SubmissionPublisher<>();
  }
  public void addValueSubscriber(Subscriber<Integer> subscriber)
  {
    numberPublisher.subscribe(subscriber);
  }
  public void addStatusSubscriber(Subscriber<Boolean> subscriber)
  {
    statusPublisher.subscribe(subscriber);
  }

  public void start()
  {
    //V1 start publishing thread
    statusPublisher.submit(true);
    running = true;
    //V2 create thread to run in
    
    //V3 notify to exit wait state of thread
  }
    public void stop()
  {
    //V1 Stop publishing
    statusPublisher.submit(false);
    running = false;
    //V2 destroy thread
    //V3 wait thread
  }
  //@Override
  public void run()
  {
    while(true)
    {
      try
      {
        Thread.sleep(20);
      }
      catch(InterruptedException exception)
      {
        //Logger.getLogger(WuerfelModel.class.getName().severe(exception.toString()));
      }
      if(currentNumber >= runTo){currentNumber = runFrom;}
      else{currentNumber +=1;}
      //publish new number
      if (running ==true)
      {
      numberPublisher.submit(currentNumber);
      //für status das code läuft möglicherweise überflüssig
      }
    }
  }
}
