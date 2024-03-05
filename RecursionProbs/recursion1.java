package RecursionProbs;


public class recursion1 {

    public static void printNum(int n)
    {
        if(n==0)        // BASE
        {
            return;
        }    
        System.out.println(n); //PRINT
        printNum(n-1);  // RECURSION
    }
    public static void main(String[] args) {
        int n = 5;
        printNum(n);
    }
    
}
 