import java.util.Scanner;

public class SumOfDigits {
    static void main() {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int finalnum=printSumDigits(num);
        System.out.println("sum of the digits  is "+finalnum);
    }
   public static int printSumDigits(int num)
   {
       int sum=0;
       while(num>0 ||num!=0)
       {
           int rem=num%10;
           sum=sum+rem;
           num=num/10;
       }
       return sum;
   }

}
