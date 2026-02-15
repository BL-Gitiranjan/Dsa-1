
import java.util.Scanner;

public class ReverseNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int finalnum=printReverseDigits(num);
        System.out.println("reverse of the digits  is "+finalnum);
    }
    public static int printReverseDigits(int num)
    {
        int rev=0;
        while(num>0 ||num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }

}

