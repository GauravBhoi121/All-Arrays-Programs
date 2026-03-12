class rspaper{
      public static void main(String args[])
      {
         int a[]=new int[]{2,7,6,1,4,5};
 
         for(int i=0;i<a.length-2;i++)
         {
                int sum=0;
                sum=sum+a[i]+a[i+1]+a[i+2];
                if (sum%3==0)
                {
                   System.out.println("{"+a[i]+","+a[i+1]+","+a[i+2]+"} = IS divisibal by 3");
                }
                else{
                     System.out.println("{"+a[i]+","+a[i+1]+","+a[i+2]+"} Not Divisibal by 3 ");
                }
           
          }
       }
   }