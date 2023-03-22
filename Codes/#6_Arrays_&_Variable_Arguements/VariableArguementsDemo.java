
// Author: Abadhesh Mishra [Employee Id: 8117322]

import java.util.Arrays;

@SuppressWarnings("all")
public class VariableArguementsDemo {

    public static void printText(String... strings)
    {
        System.out.println(Arrays.toString(strings)); 
    }

    public static void printText(int number, String... strings)
    {
        System.out.println(number + " : " + Arrays.toString(strings)); 
    }

    public static void main(String[] args) {

        System.out.println();
        
        printText();
        printText(null);
        printText("Alpha");
        printText("Alpha", "Bravo", "Charlie", "Delta", "Gamma", "Theta");

        printText(0);
        printText(0, null);
        printText(1, new String[0]);
        printText(1, new String[]{});
        printText(3, "I" , "love", "Java8", "so", "much",".");

        System.out.println();
        
    }
}
