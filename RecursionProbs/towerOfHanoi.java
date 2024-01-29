// O(2^n - 1)=O(2^n)
public class towerOfHanoi 
{
    public static void main(String[] args) {
        int n = 3; // Number of disks
        towerOfHanoi(n, 'S', 'D', 'H'); // A
        System.out.println("");
        towerOfHanoi(n, 'S', 'D', 'H'); // B
    }
    /** This method is used to move the disk from source pole to destination pole via auxili**/
    private static void towerOfHanoi(int n, char source, char destination, char auxiliary) 
    {
        if (n == 1) 
        {
            System.out.printf("Move disk 1 from %c to %c\n", source, destination);
            return;
        }
            towerOfHanoi(n - 1, source, auxiliary, destination);
            System.out.printf("Move disk %d from %c to %c\n", n, source, destination);
            towerOfHanoi(n - 1, auxiliary, destination, source);
    }
}
