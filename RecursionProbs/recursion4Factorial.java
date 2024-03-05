package RecursionProbs;

public class recursion4Factorial {
    public static void printFactorial(int n, int fac)
    {
        if(n==0)
        {
            System.out.println(fac);
            return ;
        }
        fac*=n;
        printFactorial(n-1, fac);
    }

    public static void main(String[] args) {
        int num = 5;
        printFactorial(num, 1);
    }
}
