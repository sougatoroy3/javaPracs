package RecursionProbs;

public class countPathsfrom00Tonm {
    public static int countPaths(int i, int j, int n, int m)
    {
        if (j == m || i == n)  
            return 0;
        if(i==n-1 && j==m-1)
            return 1;
        int downPaths=countPaths(i+1, j, n, m);
        int rightPaths=countPaths(i, j+1, n, m);
        // Return the sum of paths that can be formed by including either the current cell or
        return downPaths+rightPaths;
    }

    public static void main(String[] args) {
        int n=3, m=3;
        System.out.println("Number of ways to reach from 0,0 to "+n+","+m+" is : " + countPaths(0, 0, n, m));
    }
}
