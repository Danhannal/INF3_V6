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
  public boolean running;
  private ExecutorService eService;
  private SubmissionPublisher <Integer> numberPublisher;
  public SubmissionPublisher <Boolean> statusPublisher;
  
  
  public WuerfelThread()
  {
    runFrom = 1;
    runTo = 6;
    running = true;
    eService = Executors.newSingleThreadExecutor();
    numberPublisher = new SubmissionPublisher<>();
    statusPublisher = new SubmissionPublisher<>();
  
  }
  public void addValueSubscriber(Flow.Subscriber<Integer> subscriber)
  {
    numberPublisher.subscribe(subscriber);
  }
  public void addStatusSubscriber(Flow.Subscriber<Boolean> subscriber)
  {
    statusPublisher.subscribe(subscriber);
  }


  @Override
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
        exception.printStackTrace();
      }
      if(currentNumber >= runTo){currentNumber = runFrom;}
      else{currentNumber +=1;}
      //publish new number
      numberPublisher.submit(currentNumber);
      if (running ==false)
      {
        Thread.currentThread().interrupt();
        return;
      }
    }
  }
}
