import java.util.Scanner;

public class usernameFromEmail {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        String email =sc.nextLine();  // input string
        int index1 = email.indexOf('@');   // find the position of '@' character
        if (index1 == -1) System.out.println("Invalid Email");
        else
        {
            String userName = email.substring(0, index1);   // get substring from beginning
            // to '@' inclusive
            System.out.print("Username is: ");
            System.out.println(userName);     // print the username
        }
            
    }
}
