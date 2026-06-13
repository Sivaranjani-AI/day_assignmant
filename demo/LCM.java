import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int num;
        if(a > b) {
            num = a;
        }
        else {
            num = b;
        }
        while(true) {
            if(num % a == 0 && num % b == 0) {
                System.out.println("LCM = " + num);
                break;
            }
            num++;
        }
    }
}