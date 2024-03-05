/*
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 */

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=input.nextInt();
        

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2!=0)
                    System.out.print("0");
                else    
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}
