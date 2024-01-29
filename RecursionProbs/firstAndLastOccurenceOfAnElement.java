public class firstAndLastOccurenceOfAnElement 
{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println("First occurrence of element 4 is at index : " + find(arr, 0, arr.length-1, 4));
        System.out.println("\nLast occurrence of element 4 is at index :"+findLast(arr, 0, arr.length - 1, 4));
    }
    // Function to return the first occurrence of a given key in a sorted array
    static int find(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            /* If the element is present at the middle itself */
            if (arr[mid] == x)
                return mid;
            /* If the element is smaller than mid, then it can only be present in left subarray so recur 
            for left subarray */
            else if (arr[mid] > x)
                return find(arr, l, mid - 1, x);
            /* Else the element can only be present in right subarray so recur for right subarray */
            else
                return find(arr, mid + 1, r, x);
        }
        return -1;
    }
    static int findLast(int arr[], int l, int r, int x)
    {
        int i=r;
        while(i>l && arr[i-1] != x)
            i--;
        if(i<=l)
            return -1;
        return i;
    }
}
