public class LargestThreeNumbers {
    public static void main(String[] args) {

        int a = 20;
        int b = 80;
        int c = 50;

        if(a > b && a > c){
            System.out.println(a + " is largest");
        }else if(b > a && b > c){
            System.out.println(b + " is largest");
        }else{
            System.out.println(c + " is largest");
        }
    }
}