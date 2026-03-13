/*21..Find the element that appears only once when every other 
22..element appears twice.
23..Find the first non-repeated element in an array.
24..Find all pairs in an array that sum to a specific value.
25..Find the minimum element in a rotated sorted array.
26..Find the union of two arrays.*/
import java.util.*;
class setArray
{
    int a[];
    setArray(int a[])
    {
       this.a=a;
    }
    void getappearsArrayonce()
    {
          
       for(int i=0;i<a.length;i++)
       {
           int count=0;
          for(int j=0;j<a.length;j++)
          {
             if(a[i]==a[j])
             {
                count++;
             }
          }
          if(count==1)
          {
            System.out.print("\t"+a[i]);
          }
       }
    }
    void getApperarArraytwice()
    {
      for(int i=0;i<a.length;i++)
      {
         int count=0;
         for(int j=0;j<a.length;j++)
         {
            if(a[i]==a[j])
            {
               count++;
            }
         }
         if(count==2)
           System.out.print("count 2="+a[i++]);
       }
    }
    void getfirstnonrepeated()
    {
         for(int i=0;i<a.length;i++)
         {
             int count=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                   count++;
                }
            }
            if(count==1)
              System.out.print("  "+a[i++]);
        }
    }
    void getfindpairofsum()
    {
      for(int i = 0; i < a.length; i++)
      {
        for(int j =i+1;j<a.length;j++) 
        {
            if(a[i]+a[j]==12&&a[i]!=a[j])
            {
               System.out.println(a[i]+" "+a[j]);
            }
        }
      }
    }
    void getminimumelement()
    {
        int first=0;
        int last=a.length-1;
        while(first<=last)
        {
             int mid=first+(last-first)/2;
             if(a[first]<a[mid])
             {
               first=mid+1;
             }
             else if(a[last]<a[mid])
             {
                 first=mid-1;
             }
             else
             {
                  System.out.print(mid);
             }
       }
    }
    void getfindunionofArray()
    {
    }
}
class Array21to26program
{
     public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
       int a[]=new int [6];
       System.out.println("enter the value in array");
       for(int i=0;i<a.length;i++)
       { 
          a[i]=sc.nextInt();
       }
       setArray a1=new setArray(a);
       System.out.println("enter sum choice");
       int choice=sc.nextInt();
       switch(choice)
       {
          case 1:  
                 a1.getappearsArrayonce();
                 break;
          case 2:
                 a1.getApperarArraytwice();
                 break;
          case 3:
                  a1.getfirstnonrepeated();
                  break; 
          case 4:
                  a1.getfindpairofsum();
                  break;
          case 5:
                  a1.getminimumelement();
                  break;
         default :
                     System.out.println("wrong choice");
       }
     }
}