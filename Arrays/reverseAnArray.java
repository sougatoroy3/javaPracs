package Arrays;

import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("Original array is");
        System.out.println(Arrays.toString(arr));
        System.out.println("Reverse an array w/o using another array variable");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.err.println("\nReverse an array using another array");
        int[] newArr=new int[arr.length];
        for(int j=0;j<arr.length;j++) //for(int i=arr.length-1; i>=0; i--)
        {
            newArr[j] = arr[arr.length - 1 - j];//newArr[i]=arr[i]
        }
        System.out.println(Arrays.toString(newArr));
    }

    public void reverse(int[] numbers, int start, int end) {
        while (start < end) {
           int temp = numbers[start];
           numbers[start] = numbers[end];
           numbers[end] = temp;
           start++;
           end--;
        }
     }
}
