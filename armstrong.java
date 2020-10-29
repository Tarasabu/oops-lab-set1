import java.util.*;
 class armstrong 
 {
   public static void main(String args[])
   { 
    int num=153;
    int result =0;
    int rem;
    int n;
    n=num;
    while (num!=0){
      rem=num%10;
      result +=Math.pow(rem,3);
      num/=10;
    }
    if(result ==n){
      System.out.println(n+" is an armstrong number");
    }
    else{
      System.out.println(n+" is not an armstrong number");
    }
   }
 }
