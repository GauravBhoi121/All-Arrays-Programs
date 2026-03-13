/*26.Find the longest increasing subsequence in an array.     // 10 9 2 5 3 7 101 18
27.Find the maximum product of two numbers in an array.
28.Find the longest subarray with a sum equal to a given value.
29.Find the longest subarray with distinct elements.
30.Find the "k" largest elements in an array.
not printed all ....*/
import java.util.*;
class Array
{
    int a[];
    Array(int a[])
    {
        this.a=a;
    }
    void getlongestsubsequence()  // 10 9 2 5 3 7 101 18  there is find the INDEX in array and MIN of array START INDEX to
    {                                                    // a.length
        int min=a[0];int index=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
               min=a[i];
               index=i;
            }
        }
        System.out.println(min+"min...index"+index);
        for(int i=index;i<a.length;i++)
        {
           if(a[i]>min)
           {
              System.out.print("  "+a[i]);
              min=a[i];
           }
        }
       
    }
    void getmaximumproduct()
    {
       int max=0;
       int min=0;
       int product=0;
         for(int i=0;i<a.length;i++)
         {
           for(int j=0;j<a.length;j++)
           {
               if(a[i]<a[j])
               {
                  int temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
               }
           }    
         }
       max=a[a.length-2]*a[a.length-1];
       if(a[1]*a[0]>max)
       {
         max=a[0]*a[1];
       }
       System.out.println(max); 
    }
    void getsubArraysumequal()
    {
    }
    void getsubArraydistince()
    {
    }
    void getKthlargest()
    {
    }
    
}
class Arrayprogram26to30
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int a[]=new int [8];
         System.out.println("enter the value in array");
         for(int i=0;i<a.length;i++)
         {
           a[i]=sc.nextInt();
         }
         Array a1=new Array(a);
         System.out.println("1:longest increasing subsequeence");
         System.out.println("2:maximum product of two numbers");
         System.out.println("3:longest subarray with a sum equal to a given value");
         System.out.println("4:longest subarray with distinct elements.");
         System.out.println("5: k largest elements in an array");
         System.out.println("enter the choice");
         int choice=sc.nextInt();
         switch(choice)
         {
             case 1:
                       a1.getlongestsubsequence();
                       break;
             case 2: 
                       a1.getmaximumproduct();
                       break;
            default :
                      System.out.println("wrong choice");
         }
     }
}
