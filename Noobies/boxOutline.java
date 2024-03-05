public class boxOutline {
    public static void main(String[] args) {
        // Drawing a box outline using for loop and if statements.
        System.out.println("Box Outline:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i==1 || j==1 || i==5 || j==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}
