public class stackOverFlown {
    int fact(int n)
    {
        // wrong base case (it may cause stack overflow).
        if (n == 100) 
            return 1;

        else
            return n*fact(n-1);
    }
    public static void main(String[] args) {
        int num=9;
        System.out.println("Factorial of "+num+" is :"+new stackOverFlown().fact(num));
    }
}
