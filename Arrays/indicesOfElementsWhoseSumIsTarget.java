/**
 * indicesOfElementsWhoseSumIsTarget
 */
package Arrays;

public class indicesOfElementsWhoseSumIsTarget {

    public static void main(String[] args) 
    {
        int arr[]={11, 3, 7, 9, 14, 2};
        int target=17;
        System.out.println("The two elements are : " + findTwoElementIndices(arr,target));
    }
        // Function to return the sum of two numbers in an array whose sum is equal to a given number 'target'
        //Method to return the sum of two numbers in an array which gives a given number as output
    public static String findTwoElementIndices(int []arr , int target)
    {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < arr.length; i++) 
        {
            int complement = target - arr[i];
            if (map.containsKey(complement)) 
            {
                return ""+map.get(complement)+" "+i;
            } 
            else
            {
                map.put(arr[i], i);
            }
        }
        return "No Pair Found";
    }
}