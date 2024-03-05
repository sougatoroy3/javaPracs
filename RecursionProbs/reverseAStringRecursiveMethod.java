package RecursionProbs;

public class reverseAStringRecursiveMethod {

    //Reverse a String using Recursion in Java
    
    public static void reverse2(String str, int idx)
    {
        if(idx==0)
        {
            System.out.println(str.charAt(idx));
            return ;
        }
        System.out.print(str.charAt(idx));
        reverse2(str, idx-1);
    }
    public static void main(String[] args) 
    {
        String inputStr = "Hello World";
        System.out.print("Input String is: ");
        System.out.println(inputStr);
        int len = inputStr.length();
        System.out.print("Reversed String is: ");
        reverse2(inputStr, len-1);
    }
}