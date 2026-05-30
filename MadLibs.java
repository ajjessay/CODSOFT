import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        String adj1;
        String noun1;
        String adj2;
        String verb1;
        String adj3;

        System.out.println("Enter an adjective:");
        adj1=scanner.nextLine();
        System.out.println("Enter a noun:");
        noun1=scanner.nextLine();
        System.out.println("Enter another adjective:");
        adj2=scanner.nextLine();
        System.out.println("Enter a verb:");
        verb1=scanner.nextLine();
        System.out.println("Enter one more adjective:");
        adj3=scanner.nextLine();    

        System.out.println("Today i went to a " + adj1 + " zoo");
        System.out.println("In an exhibit i saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adj2 + " and " + verb1 + "ing.");
        System.out.println("I WAS " + adj3 + "!");
        scanner.close();


    




        
}
}