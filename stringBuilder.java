public class stringBuilder 
{
    // Declare a StringBuilder object called "builder"
    public static void main(String[] args) 
    {
        StringBuilder builder = new StringBuilder("Tony");
        System.out.println("\n \nThe initial value of the StringBuilder is: " + builder);
        // Use the append() method to add more characters to the end of the StringBuilder
        builder.append(" loves programming.\n");
        System.out.println("After using the append() method, the value of the StringBuilder is- " +builder);

        System.out.println("First letter is "+builder.charAt(0)+" which has an index value of 0");  
        builder.setCharAt(0, 'P');
        System.out.println("Replacing the first letter 'T' with 'P' which results in\n"+builder);
        System.out.println("Length of the string is - "+builder.length());
        /*
        * Use the append() method to add strings and integers to the StringBuilder.
        */
        System.out.println("Use the append() method to add strings and integers to the StringBuilder.");
        builder.append("\nHello");
        builder.append(", ");
        builder.append("World!");
        int myInt = 42;
        builder.append(" The answer is ");
        builder.append(myInt);
        System.out.println(builder);
        /*
        * Use the reverse() method to reverse the order of characters in the StringBuilder.
        */
        System.out.println("\nReversal");
        builder.reverse();
        System.out.println(builder);

        System.out.println("\nReversal using loops");
        for(int i=0; i<builder.length()/2; i++) {
            int front = i;
            int back = builder.length() - i - 1;
     
     
            char frontChar = builder.charAt(front);
            char backChar = builder.charAt(back);
     
     
            builder.setCharAt(front, backChar);
            builder.setCharAt(back, frontChar);
          }
     
     
          System.out.println(builder);
     
        /*
        * Use the insert() method to insert a substring into the StringBuilder at a specific index.
        */
        System.out.println("\nInsertion");
        String insertMe = "Sup";
        int insertIndex = 3;
        builder.insert(insertIndex, insertMe);
        System.out.println(builder);
        /*
        * Use the delete() method to remove a range of characters from the StringBuilder.
        */
        System.out.println("\nDeletion");
        int startDelete = 0;
        int endDelete = 5;
        builder.delete(startDelete, endDelete);
        System.out.println(builder);
        
    }
}
