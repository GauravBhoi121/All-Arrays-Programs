/*Q1. Write a program to find the longest increasing subsequence in a given array of integers.  
Input: [10, 22, 9, 33, 21, 50, 41, 60]  
Output: 5  
(Here, the LIS is [10, 22, 33, 50, 60])  
  
  Q2. Write a program to find all unique triplets in an array that give the sum of zero.  
Input: [-1, 0, 1, 2, -1, -4]  
Output: [[-1, -1, 2], [-1, 0, 1]]  
 
  Q3. Given an array, write a program to find the maximum product subarray.  
Input: [2, 3, -2, 4]  
Output: 6  
(Explanation: The subarray [2, 3] has the maximum product 6)*/
import java.util.*;
class Array
{
    int a[];
    public void setArray(int a[])
    {
        this.a=a;
    }
    public void getArray()
    {
       int temp=0;
       for(int i=0;i<a.length;i++) //10 22 9 33 21 50 41 60
       {
          int max=a[i];
           int count=1;
          for(int j=i+1;j<a.length;j++)
          {     
             if(a[j]>max)
             {
                 max=a[j];
                 count++;
             }
          }
          //System.out.println(count);
          if(count>temp)
          {
             temp=count;
             System.out.println("count is ="+temp);
          }
       }
       
    }
}
public class jsArrayApp
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
        int a[]=new int [8];
       System.out.println("enter the choice");
       int choice=sc.nextInt();
       switch(choice)
       {
          case 1:
                    System.out.println("enter the array");
                    for(int i=0;i<a.length;i++)
                    {
                       a[i]=sc.nextInt();
                    }
                    Array b=new Array();
                    b.setArray(a);
                    b.getArray();
                    break;
          case 2:
                   System.out.println("enter the array");
                   for (int i=0;i<a.length;i++)
                   {
                      a[i]=sc.nextInt();
                   }
                   break;b     
           default:
                    System.out.println("wromg choice ");
      }
   }
}
                   