//package RecursionProbs;

public class recursion6StackHeightN {
    public static int printPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        
        int xPowNMinus1 = printPower(x, n-1);
        int xPowN = x * xPowNMinus1;
        return xPowN;
    }
    public static void main(String args[]) {
        int x = 2, n = 5;
        int output = printPower(x, n);
        System.out.println(output);
    }
}
