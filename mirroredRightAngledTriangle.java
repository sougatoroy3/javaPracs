import java.util.Scanner;

public class mirroredRightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //outer loop for rows
        for(int i=1; i<=n; i++)
        {
            //inner loop for columns, printing spaces
            for (int j = 1 ; j <= n-i ; j++ ) System.out.print(" ");
            for(int j=1; j<=i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
