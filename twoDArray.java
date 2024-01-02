import java.util.Scanner;

public class twoDArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rows, cols;
        System.out.println("Enter number of rows: \n And colums:");
        rows=sc.nextInt();
        cols=sc.nextInt();

        int[][] numbers=new int[rows][cols];
        //int numbers[][] = new int[5][3];  //Declaration and initialization in one line
        System.out.println("\n Enter the elements of array : ");
        //INPUT
        //Columns
        for(int i=0;i<rows;i++)
        {
            //Rows
            for(int j=0;j<cols;j++)
            {
                numbers[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the number to be searched-");
        int nos=sc.nextInt();

        //Output
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(nos==numbers[i][j])
                    System.out.println("Index is - "+i+" , "+j);
            }
        }
    }
}
