import java.util.*;
 class fibonacci 
 {
   public static void main(String args[])
   { 
    int n1=0;
    int n2=1;
    int n3;
    int n=15;
    for(int i=1;i<=n;i++){
      System.out.print(n1+" ");
      n3=n1+n2;
      n1=n2;
      n2=n3;
    }
   }
 }
