import java.util.Scanner;

public class HelloWorld2 {
    //In order to run your code, you must have a main method (see below).//
    // This will allow you to print to the console.//
    public static void main(String[] args) {
//        System.out.println("Hello World2!");
        //Now go to the left hand side, right click on Hello World2 and hit Run. It should print to the console.//

        //Another way to print to the console (without using ln or Line)//
//        System.out.print("Hello World2!");

        //This will automatically import the scanner package seen on line 1//
        //The scanner package takes input or answers from the user//
        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = input.nextLine();
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        // The \n. forces linebreaks.//
        //The % indicates where arguments passed to the template should be placed.//
        // The %s formats strings//
        System.out.printf("Hello %s %s!\n", firstName, lastName);
        System.out.printf("Goodbye %s %s!\n", firstName, lastName);

    }


}




