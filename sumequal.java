/*Input: nums = [1,5,11,5]
Output: true
Explanation: The array can be partitioned as [1, 5, 5] and [11].
Example 2:

Input: nums = [1,2,3,5]
Output: false
Explanation: The array cannot be partitioned into equal sum subsets.*/
import java.util.*;
class array
{
   int a[];
    void setarray(int a[])
    {
      this.a=a;
    }
    int getarray()
    {
        for(int i=0;i<a.length;i++) 
        {
           int sum=0;
           for(int j=0;j<a.length;j++)
           {
              if(a[i]!=a[j])
              {
                 sum=sum+a[j];
              }
           }
           if(a[i]==sum)
           {
              return i;
           }
        }
       return -1;
     }
}
class sumequal
{
    public static void main(String args[])
    { 
       Scanner sc=new Scanner(System.in);
       int a[]=new int [4];
      System.out.println("enter the value in array");
      for(int i=0;i<a.length;i++)
      {
         a[i]=sc.nextInt();
      }
      System.out.println("display the array");
      array a1=new array();
      a1.setarray(a);
      int result=a1.getarray();
      if(result!=-1)
      {
           System.out.println("true");
      }
      else 
      { 
           System.out.println("false");
      }
    }
}