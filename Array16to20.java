/*16.Binary search in a sorted array.
17.Search for a pair with a given sum in an array.
18.Find the majority element in an array (element that appears more than ⌊ n/2 ⌋ times).
19.Find the peak element in an array.
20.Sort an array using quicksort or mergesort.
*/
import java.util.*;
class setArray 
{
    int a[],val;
    setArray(int a[],int val)
    {
       this.a=a;
       this.val=val;
    }
    void getbinaryArray()
    {
       int first=0;
       int last=a.length-1;
       while(first<=last)
       {
           int mid=first+(last-first)/2;
           if(val>a[mid])
           {
              first=mid+1;
           }
           else if(val<a[mid])
           {
               last=mid-1;
           }
           else
           {
             System.out.println("value is found"+a[mid]);
             break;
           }
        }
      System.out.println("not found");
    }
    void getpair()
    {
       
       for(int i=0;i<a.length-1;i++)
       {
           int first=a[i];
           int last=a.length-1;
          if(a[first]+a[last]==val)
          {
             System.out.println("("+a[first]+","+a[last]+")");
          }
          
       }
    }
    void findmajority()
    {
       
        for(int i=0;i<a.length-1;i++)
        {
            int count=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                   count++;
                }
             }
           if(count>(a.length-1)/2)
              System.out.println(a[i]++);
        }
     }
     void getpaekelement()
     {
         int first=-1;
         int last=a.length;
         for(int i=0;i<a.length-1;i++)
         {
            int mid=a[i];
            if(first>a[i]||a[i+1]<a[i])
            {
              System.out.println(""+a[i]);
            }
        }
     }
}
class Array16to20
{
      public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        int a[]=new int [7];
        System.out.println("enter sum value in array");
        for(int i=0;i<a.length;i++)
        {
           a[i]=sc.nextInt();
        }
        System.out.println("enter the search value");
        int val=sc.nextInt();
        setArray s1=new setArray(a,val);
        //s1.getbinaryArray();
        //s1.getpair();
        //s1.findmajority();
        s1.getpaekelement();
       }
 }
     
