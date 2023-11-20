/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package versuch_6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

/**
 *
 * @author Kieran
 */
public class WuerfelThread implements Runnable
{
  private int runFrom;
  private int runTo;
  private int currentNumber;
  public volatile boolean running;
  private ExecutorService eService;
  private SubmissionPublisher <Integer> numberPublisher;
  public SubmissionPublisher <Boolean> statusPublisher;
  
  
  public WuerfelThread()
  {
    runFrom = 1;
    runTo = 6;
    running = false;
    eService = Executors.newSingleThreadExecutor();
    numberPublisher = new SubmissionPublisher<>();
    statusPublisher = new SubmissionPublisher<>();
    //stop();
  }
  public void addValueSubscriber(Flow.Subscriber<Integer> subscriber)
  {
    numberPublisher.subscribe(subscriber);
  }
  public void addStatusSubscriber(Flow.Subscriber<Boolean> subscriber)
  {
    statusPublisher.subscribe(subscriber);
  }

   public synchronized void stop()
   {
     running = false;
     //set var that causes this.wait in run that uses while

   }
   public synchronized void start()
   {
     running = true;
     this.notify();
   }

  @Override
  public void run()
  {
    while(true)
    {
      while(!running)
      {
        try{synchronized(this){this.wait();}}
        catch(InterruptedException e){e.printStackTrace();}
      }
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

      numberPublisher.submit(currentNumber);
      //für status das code läuft möglicherweise überflüssig
      
    }
  }
}
