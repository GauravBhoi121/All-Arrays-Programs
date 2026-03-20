/* find the sorting int quicksort and margesort Array
...not displeing the sorting of array quick sort and margesort*/
import java.util.*;
class sorting 
{
    int a[];
    sorting (int a[])
    {
       this.a=a;
    }
    void getquicksort()
    {
        int first=0,last=a.length-1;
        while(first<last)
        {
           int index=first-1;
           int pivat=a[last]; 
           for(int j=first;j<last;j++)
           {
               if(a[j]<=pivat)
               {
                  index++;
                  int temp=a[j];
                  a[j]=a[index];
                  a[index]=temp;
               }
           }
        
    }
    void getmargesort()
    {
    }
}
class quickANDmargesort
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
         sorting s1=new sorting(a);
         s1.getquicksort();
         s1.getmargesort();
       }
}