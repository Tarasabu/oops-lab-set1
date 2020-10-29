import java.util.*;
 class palindrome 
 {
   public static void main(String args[])
   { 
    int rem;
    int rev=0;
    int n=151;
    int num;
    num=n;
    while (n!=0){
      rem=n%10;
      rev=(rev*10)+rem;
      n/=10;
    }
    if(rev==num){
      System .out .println (num+" is a palindrome");
       }
       else{
         System.out.println (num+" is not a palindrome");
       }
   }
 }
