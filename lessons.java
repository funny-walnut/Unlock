import java.util.*;

public class Level1
{
    public static String PatternUnlock(int N, int [] hits)
   {
       String s = new String();
       int [][] lock = {{6,1,9},{5,2,8},{4,3,7}};
        int [] arrayK = new int[N];
        int [] arrayL = new int[N];
       for (int i = 0;i<N; i++)
       {
           for (int k=0;k<3;k++ )
           {
               for (int l= 0 ; l<3; l++)
               {
                   if (hits [i] ==lock[k][l])
                   {
                       arrayK [i] = k;
                       arrayL [i] = l;
                       System.out.println(k + " " +l);
                   }
               }
           }
       }
       double sum =0;
       for (int h = 1; h<N; h++)
       {
           if ((arrayK[h]==arrayK[h-1]+1)||(arrayK[h]==arrayK[h-1]-1) || (arrayL[h]==arrayL[h-1]+1)||(arrayL[h]==arrayL[h-1]-1)) {
               sum = sum+1;
           } else if ((arrayK[h]==arrayK[h-1]+1)||(arrayK[h]==arrayK[h-1]-1) && (arrayL[h]==arrayL[h-1]+1)||(arrayL[h]==arrayL[h-1]-1))
           {
               sum = sum+ Math.sqrt(2);
           } else if ((arrayK[h]==arrayK[h-1]+2)||(arrayK[h]==arrayK[h-1]-2) && (arrayL[h]==arrayL[h-1]+2)||(arrayL[h]==arrayL[h-1]-2))
           {
               sum = sum + 2*Math.sqrt(2);
           }

       }
       System.out.println("summ = " + sum);
       s = String.format("%.5f", sum);
       char []charArray=s.toCharArray();
       char [] newCharArray = new char[charArray.length];
       for (int i=0; i<charArray.length;i++)
       {
           if (charArray[i]!='0'&& charArray[i]!=',' && charArray[i]!='.')
           {
               newCharArray[i]=charArray[i];
           }
       }
      s = String.valueOf(newCharArray);
       return s;
   }
}
