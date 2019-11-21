import java.util.*;

public class Pooling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] sports = {"Racing", "football", "hockey", "Rugby", "Basketball"};


        System.out.print("How many users do you want to pool? - ");
        int numOfUsers = input.nextInt();
        int[][] rating = new int[5][numOfUsers];
        int[] rowSum = new int[5];
        int[] colSum = new int[numOfUsers];

        for (int i=1; i <= numOfUsers; i++) {
            System.out.println("Let's take in your input user "+i);
            for(int j=0; j<=4; j++) {
                System.out.printf("How much do you like %s: ", sports[j]);
                int value = input.nextInt();

                while(value > 10 || value < 1) {
                    System.out.print("Value must not be greater than 10. Try again: ");
                    value = input.nextInt();
                }
                rating[j][i-1] = value;
            }
            System.out.printf("Thanks for your time user %d%n%n",i);
        }

        System.out.println();
        for(int rows = 0; rows < rating.length; rows++) {
            System.out.printf("%s: ", sports[rows]);
            int total1 = 0, total2 = 0;

            for (int cols=0; cols < rating[rows].length; cols++) {
                System.out.printf("%2d ", rating[rows][cols]);
                total1 += rating[rows][cols];
            }
            System.out.print(total1);
            System.out.println();
        }

    }
}
