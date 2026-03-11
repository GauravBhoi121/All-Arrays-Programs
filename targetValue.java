class targetValue{
      public static void main (String args[]){ 
      int a[]=new int[]{1, 4, 20, 3, 10, 5};
      int target = 33;
 
      for(int i=0;i<a.length-2;i++)
      {
          int sum =0;
          sum = sum+a[i]+a[i+1]+a[i+2];
          if(sum==target)
           {
               System.out.println("{"+a[i]+","+a[i+1]+","+a[i+2]+"} "+sum);
           }
      }
   }
}