// Get Bit 

public class getBitManipulation {
    public static void main(String[] args) {
        int n = 5; //decimal equivalent of binary number 101
        int pos=2;
        int pos2=3;
        int bitMask=1<<pos;
        int bitMask2=1<<pos2;

        if((bitMask & n)==0)
            System.out.println("Bit was 0");
        else
            System.out.println("Bit was 1");

        if((bitMask2 & n)==0)
            System.out.println("Bit was 0");
        else
            System.out.println("Bit was 1");
    }
}
