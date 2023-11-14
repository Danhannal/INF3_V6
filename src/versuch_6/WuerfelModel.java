/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package versuch_6;

/**
 *
 * @author Kieran
 */
public class WuerfelModel implements Runnable 
{
  private int runFrom;
  private int runTo;
  private int currentNumber;
  private boolean running;
  public WuerfelModel()
  {
    runFrom = 1;
    runTo = 6;
    running = false;
  }

  @Override
  public void run()
  {
    while(running)
    {
      try
      {
        Thread.sleep(20);
      }
      catch(InterruptedException exception)
      {
        
      }
      if(currentNumber >= runTo){currentNumber = runFrom;}
      else{currentNumber +=1;}
      
    }
  }
}
