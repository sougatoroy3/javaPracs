public class timeComplexityCalculationDemo {
    //This program is used to calculate the time complexity
    public static void main(String[] args) {
        double now=System.currentTimeMillis();

        timeComplexityCalculationDemo demo=new timeComplexityCalculationDemo();
        System.out.println(demo.findSum(99999));

        System.out.println("Time taken - "+(System.currentTimeMillis()-now)+"millisecs");
    }

    int findSum(int n)
    {
        return n*(n+1)/2;   //time complexity of O(n)
    }

    /*int findSum(int n)
    {
        int sum=0;
        for(int i=0;i<=n;i++)
            sum+=i;          //time complexity of O(n^2) due to loop inside function call
        return sum;
    } */
}
