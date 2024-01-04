import java.util.Scanner;

public class updateBitManipulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5; //0101
        int pos1=1, pos2=2;
        int bitMask1=1<<pos1;
        int bitMask2=1<<pos2;

        int operation=sc.nextInt(); // Input whether to update to 1 or 0

        if(operation==1)
        {
            //setBitManipulation
            int newNum=bitMask1 | n;
            int newNum2=bitMask2 | n;
            System.out.println(newNum+"   "+newNum2);
        }
        else if(operation==0)
        {
            //clearBitManipulation
            int complement1=~(bitMask1);
            int complement2=~(bitMask2);
            int newNum3=(complement1 & n);
            int newNum4=(complement2 & n);
            System.out.println(newNum3 +"   " + newNum4);
        }
        else
            System.out.println("WRONG INPUT");
    }
}
