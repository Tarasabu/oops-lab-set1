import java.util.*;
 class factors 
 {
   public static void main(String args[])
   { 
    int n=10;
    System.out.println("Factors of "+n+" are:");
    for(int i=1;i<=n;i++){
      if(n%i==0){
        System.out.println(i+" ");
      }
    }
   }
 }
