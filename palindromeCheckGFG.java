import java.util.Scanner;

public class palindromeCheckGFG {
    public static int palinArray(int[] a, int n)
    {
        //add code here.
        int[] aCopy;
        for(int i=0; i<n; i++)
        {
            int num=0;
            while(a[i]!=0)
            {
                int dig=a[i]%10;
                num*=10+dig;
                a[i]/=10;
            }
            aCopy[i]=num;
            System.out.println(aCopy[i]);
        }
    }
        public static void main(String args[])
        {
            //Scanner sc=new Scanner(System.in);
            int[] arr={111, 222, 333, 444, 555};
            palinArray(arr, 5);
        }
}
