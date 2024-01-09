//package RecursionProbs;

public class recursion5Fibonacci {
    public static void printFibonacci(int a, int b, int n)
    {
        if (n==0)
        {
            return;
        } 
        System.out.print(a+" ");
        int c = a + b;
        //System.out.print(c);
        a=b;
        b=c;
        printFibonacci(a, b, n-1);
    }

    /*Driver code*/
    public static void main (String[] args)
    {
        int n=10;//Number of terms in Fibonacci series to be printed
        printFibonacci(0, 1, n);
        /* 
        int a=0, b=1;
        System.out.print(a+","+b);
        int n=8;
        printFibonacci(a,b,n-2);
        */
    }
}
