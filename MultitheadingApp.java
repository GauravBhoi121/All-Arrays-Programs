import java.util.*;
class thread1 extends Thread
{
    public void run()
    { 
       try{
        for(int i=0;i<10;i++)
        {
           System.out.println(" "+i);
           Thread.sleep(1000);
        } 

       }
       catch(Exception ex){System.out.println(" not work"+ex);}
    }
}
class thread2 extends Thread
{
    public void run()
    { 
       try{
        for(int i=0;i<10;i++)
        {
           System.out.println(" "+i);
           Thread.sleep(500);
        }
       }
       catch(Exception ex){System.out.println(" not work"+ex);}
    }
}
class MultitheadingApp
{
      public static void main(String args[])
      {
          try(Scanner Sc=new Scanner(System.in))
          {
          thread1  t1=new thread1();
          t1.start();
        
          thread2  t2=new thread2();
          t2.start();
          }
          catch(Exception ex){System.out.println("not works "+ex);}
          
      }
}
      