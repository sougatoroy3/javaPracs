public class bitManipulation 
{
    public static void main(String[] args) 
    {
        int n = 9;
        int position=2;

        System.out.println("Original Number: " + n);

        // Setting the given bit at the specified position to 1
        n = setBitAtPosition(n,position);
        System.out.println("\nNumber after setting the bit at position "+position+" to 1 :" + n);

        // Checking if the bit is set or not at the specified position
        boolean isSet = isBitSetAtPosition(n,position);
        System.out.println("\nIs the bit at position "+position+" set? \t Answer :\t"+isSet);

        // Resetting the bit at the specified position to 0
        n = resetBitAtPosition(n,position);
        System.out.println("\nNumber after resetting the bit at position "+position+" to 0 :" + n);
        
        //Checking if the bit is reset or not at the specified position
        isSet = isBitResetAtPosition(n,position);
        System.out.println("\nIs the bit at position "+position+" reset? \t Answer :\t"+isSet);
    }
        /** Method to check and set a bit at a specific position in a number */
        private static int setBitAtPosition(int num, int pos)
        {
            return num | (1 << pos);
        }
        /** Method to check whether a bit is set or not at a specific position in a number*/
        private static boolean isBitSetAtPosition(int num, int pos)
        {
            return ((num >> pos & 1) == 1) ? true : false;
        }
        /**Method to check and reset a bit at a specific position in a number*/
        private static int resetBitAtPosition(int num, int pos)
        {
            return num & ~(1 << pos);
        }
        /**Method to check whether a bit is reset or not at a specific position in a number*/
        private static boolean isBitResetAtPosition(int num, int pos)
        {
            return !isBitSetAtPosition(num,pos);
        }
        
}

