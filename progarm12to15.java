//12.Check if a given array is sorted or not.
//13.Find the largest sum of a contiguous subarray (Kadane’s algorithm).
//14.Find the second largest element in an array.
//15.Find the kth smallest or largest element in an array.
import java.util.*;
class Array
{
    int a[],k;
    
    void setArray(int a[],int k)
    {
         this.a=a;
         this.k=k;
    }
    void getsortedArray()
    {
       int  count=1;
        for(int i=0;i<a.length-1;i++)
        {
           if(a[i]<=a[i+1])
           {
             count++;
           }
        }  
        if(count==a.length)
        {
             System.out.println("it is a sorted array");
        }
        else
           System.out.print("it is not sorted array");   
    }
    void getlargestsum()
    {
       int sum=0;
       for (int i=0;i<a.length;i++)
       {
          sum=sum+a[i];
       }
       System.out.println(sum);
    }
    void getsecondlargest()
    {  int larg=a[1];
       Arrays.sort(a);
       for (int i=a.length;i>0;i--)
       {
         //no longer the logic 
       }
        System.out.println(larg); 
    }
    void getKthsmallestANDlargest()
    {
        int larg=a[0];
        int small=a[0];
       for (int i=0;i<=k;i++)
       {
          if(a[i]>larg)
          {
             larg=a[i];
          }
          if(a[i]<small)
          {
             small=a[i];
          } 
       }
       System.out.println("larg= "+larg);
        System.out.println("samll= "+small);
    }
}
class progarm12to15
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner (System.in);
          int a[]=new int [6];
          System.out.println("enter value in array");
          for (int i=0;i<a.length;i++)
          {
              a[i]=sc.nextInt();
          }
          Array a1=new Array();
          System.out.println("1.Check if a given array is sorted or not.");
          System.out.println("2.Find the largest sum of a contiguous subarray (Kadane’s algorithm).");
          System.out.println("3.Find the second largest element in an array.");
          System.out.println("4.Find the kth smallest or largest element in an array.");
          System.out.println("enter the choice");
          int choice=sc.nextInt();
          switch(choice)
          {
              
              case 1:
                      
                       a1.getsortedArray();
                       break;
              case 2:
                       
                       a1.getlargestsum();
                       break;
              case 3:
                       
                       a1.getsecondlargest();
                       break;
              case 4:
                       System.out.println("k pointer of ");
                       int k=sc.nextInt();
                       a1.setArray(a,k);
                       a1.getKthsmallestANDlargest();
                       break;
            default :
                      System.out.println("choice is wrong ");
         }
    }
}