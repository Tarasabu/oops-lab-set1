import java.util.*;
 class factorial
 {
   public static void main(String args[])
   { 
    int n=6;
    int fact=1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        fact=(fact*j);}
        System.out.println ("Factorial of "+i+" is "+fact);
        fact=1;
    }
   }
 }
