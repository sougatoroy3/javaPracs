package Arrays;

import java.util.Arrays;

public class declarationAndInitialization {

    public void printArray(int[] arr)
    {
        int n=arr.length;
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        //Another Method
        System.out.println("\nUsing toString() function");
        System.out.println(Arrays.toString(arr));
    }

    public void arrayDemo()
    {
        int[] myArray=new int[5];
        
        myArray[0]=5;
        myArray[1]=1;
        myArray[2]=8;
        myArray[3]=2;
        myArray[4]=10;
        myArray[2]=9;
        System.out.println(myArray.length); //output: [5 6 7]
        //myArray[5]=26; // throws out of bound exception

        printArray(myArray);
    }
    public static void main(String[] args) {
        //int[] myArray;
        //int myArray1[]; // This is also valid, but not recommended because it's harder to read.
        //int[] myArray2=new int[5]; 
        //int myArray3[]=new int[5];
        //int[] myArray4={5,4,3,2,6};
        declarationAndInitialization obj = new declarationAndInitialization();
        obj.arrayDemo();

        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; 
  
        System.out.println( "\n Printing Values of Multi-Dimensional Array using deepToString() function"); 
        System.out.println(Arrays.deepToString(array)); 
    }
}
