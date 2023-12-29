import java.util.Scanner;

public class numericPyramid1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        /*
        for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }


           //numbers
           for(int j=1; j<=i; j++) {
               System.out.print(i+" ");
           }
           System.out.println();
        }

         */

        //myLogic
        for(int i=1; i<=n; i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            int k=i;
            for(int l=1;l<=i;l++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
