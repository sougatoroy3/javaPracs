public class clearBitManipulation {
    public static void main(String[] args) {
        int num = 5;
        int pos=2;
        int bitMask=1<<pos;

        int notN=~(bitMask);
        int newNum=notN & num;
        System.out.println(newNum);
    }
}
