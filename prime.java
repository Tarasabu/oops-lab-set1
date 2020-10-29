import java.util.*;

 class prime 
 {
   public static void main(String args[])
   { 
     int i;
    int n=5;
    boolean flag =false ;
    for(i=2;i<n;i++){
      if(n%i==0){
        flag=true;
        break ;
      }
    }
    if(flag=true){
      System.out.println (n+" is not prime");
    }
    else{
      System.out.println (n+" is prime");
    }
   }
 }
