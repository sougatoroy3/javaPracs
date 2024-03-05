package RecursionProbs;

import java.util.Scanner;

public class recursion3 {
    public static void printSUM(int n, int sum)
    {
        if(n==0)
        {
            System.out.println(sum);
            return ;
        }
        sum+=n;
        printSUM(n-1, sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the natural number till where you want the sum : ");
        int num=sc.nextInt();
        printSUM(num, 0);
    }
}
