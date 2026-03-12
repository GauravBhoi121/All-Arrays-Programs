import java.util.*;
class mystack
{
   int stack[]=new int [5];
   int top=-1;
   boolean emptystatus=false;
   void push(int val)
   {
     if(top==(stack.length-1))
     {
       System.out.println("statck is overflow");
     }
     else
     {
        
        top=top+1;
        stack[top]=val;
     }
   }
   int pop()
   {
       int value=0;
      if(top==-1)
      {
        emptystatus=true;
      }
      else
      {
        value=stack[top]; 
        top=top-1;
      }
     return value;
   }
   boolean isEmpty()
   {
       return emptystatus;
   }
   void display()
   {
      if(top==-1)
      {
         emptystatus=true;
         System.out.println("underflow");
      }
      else
      {
         for(int i=top;i>=0;i--)
         {
            System.out.println(" "+stack[i]);
         }
      }
   }
}
class stackapp
{
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        mystack s1=new mystack();
        do{
              System.out.println("1.push");
              System.out.println("2.pop");
              System.out.println("3.display");
              System.out.println("enter the choice");
              int choice=sc.nextInt();
              switch(choice)
              {
                   case 1:
                             System.out.println("enter thr value in stack");
                             int value=sc.nextInt();
                             s1.push(value);
                             break;
                  case 2:
                           boolean result=s1.isEmpty();
                           if(!result)
                           {
                               System.out.println("delete value form stack"+s1.pop());
                           }
                           else
                           {
                               System.out.println("stack is underflow");
                           }
                           break;
                case 3:
                          System.out.println("display result");
                          s1.display();
                          break;
               case 4:
                         System.exit(0);
                         break;
               default :
                         System.out.println("its worng choice");
          }    
       }while(true);            
    }
}    
  