package Arrays;

import java.util.Arrays;

public class oddNosCounterAndEvenRemover {
    /**
     * @param arr
     * @return
     */
    void countOdd(int arr[])
    {
        // Counter for odd numbers
        int cnt = 0;
        int[] result=new int[arr.length];
        // Iterate through all array elements
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]%2!=0)
            {
                cnt++;   // Increment the counter when an odd number is found.
                result[i]=arr[i];
            }
        }
        System.out.println("Number of ODD integers in given set are : " +cnt);
        System.out.println(Arrays.toString(result)); 
    }
    public static void main(String args[])
    {
        oddNosCounterAndEvenRemover ob=new oddNosCounterAndEvenRemover();
        int myArr[]={1,4,6,9};
        System.out.println("Original array is: ");
        System.out.println(Arrays.toString(myArr));
        
        // Call function to remove even numbers and get the new array with only odd numbers
        ob.countOdd(myArr);
    }
}
