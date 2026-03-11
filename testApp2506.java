class testApp2506
{
   public static void main(String args[])
   { 
       for(int i=0;i<=4;i++)
       {
            int k=0;
           for(int j=0;j<=4;j++)
           {
               if(j>=i)
               {
                    System.out.print(" "+(j-i));
               }
               else 
               {
                   System.out.print(" "+(i-j));
               }
           }
          System.out.println(""); 
       }
   }
}