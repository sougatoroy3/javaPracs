public class setBitManipulation 
{
    public static void main(String[] args) {
        int n = 5; // given number
        int pos=1;
        int bitMask=1<<pos;

        int newN=bitMask | n;
        System.out.println(newN);
    }
}
