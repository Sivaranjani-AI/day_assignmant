import java.util.Scanner;
public class Armstrong{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int num = n ;
        int sum = 0;
        while (n > 0) {
          int d = n % 10;
          sum = sum + (d*d*d);
          n= n / 10;
        }
        if (sum==num){
            System.out.println(num + "Armstrong Number");
        } else {
            System.out.println(num + "Not An Armstrong Number");
        }
    }
}