/*1. Given a sorted array of integers, write a program to search for a specific element using binary search.

Your Task : you have to create class name as BinarySearch with following methods 
void setArray(int a[]): this function can accept integer array as parameter 
int binarySearch(int key): this function can accept the search as parameter and find search key in array and return its index and if search key not found in array return -1

Example: Suppose we have following array
Example1:  
Array :            a=[10,20,30,40,50,60,70,80,90,100];
Search key    key=80
Output: search key found on index  : 7 

Example2:  
Array :            a=[10,20,30,40,50,60,70,80,90,100];
Search key         key=100
Output: search key not found so index   : -1 
*/
import java.util.*;
class search
{
    int a[],val;
    void setArray(int a[],int val)
    {
       this.a=a; 
       this.val=val;
    }
    void getArray()
    {
       int first=0;
       int last=a.length-1;    //a=[60,70,80,90,100]
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
           else if(val==a[mid])
           {
              System.out.println(""+mid);
              break;
           }
       }
    }
    void getArray2()
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
                System.out.println(mid);
                break;
           }
       }
    }   
}
class binarysearch
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int a[]=new int [10];
         System.out.println("enter the value in array");
         for (int i=0;i<a.length;i++)
         {
             a[i]=sc.nextInt();
         } 
         System.out.println("serch value ");
         int val=sc.nextInt();
         search a1=new search();
         a1.setArray(a,val);
         a1.getArray2();
     }
}
