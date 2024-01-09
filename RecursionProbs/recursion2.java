
public class recursion2 {

    public static void printNum(int n)
    {
        if(n==6)        // BASE
        {
            return;
        }    
        System.out.println(n); //PRINT
        printNum(n+1);  // RECURSION
    }
    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    }
    
}
 
