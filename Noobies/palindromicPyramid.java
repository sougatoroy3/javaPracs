public class palindromicPyramid {
    public static void main(String[] args) {
        int n = 5; // size of pyramid

        /*
        for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }


           //first part
           for(int j=i; j>=1; j--) {
               System.out.print(j);
           }


           //second part
           for(int j=2; j<=i; j++) {
               System.out.print(j);
           }
           System.out.println();
        }

         */

        //myLogic
        for(int i=1; i<=n; i++)
        {
            for(int j=i; j<n; j++)
            {
                System.out.print(" ");
            }

            for(int k=i; k>=1; k--)
            {
                System.out.print(k);
            }

            for(int l=2; l<=i; l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
