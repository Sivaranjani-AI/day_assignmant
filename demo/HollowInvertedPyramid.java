public class HollowInvertedPyramid {
    public static void main(String[] args) {

        int n = 5;

        for(int i = n; i >= 1; i--) {

            for(int s = 0; s < n-i; s++)
                System.out.print(" ");

            for(int j = 1; j <= 2*i-1; j++) {

                if(i == n || j == 1 || j == 2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}