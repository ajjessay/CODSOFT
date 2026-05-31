import java.util.Scanner;
public class ShopCart{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency='$';
        double total;

        System.out.print("Enter the item name: ");
        item=scanner.nextLine();

        System.out.print("what is the price for each");
        price=scanner.nextDouble();

        System.out.print("how many do you want to buy");
        quantity=scanner.nextInt();

        total=price*quantity;

        System.out.println("You have added "+quantity+" "+ item+"(s) to your cart at a price of "+currency+price+" each.");
        System.out.println("The total price is: "+currency+total);


        scanner.close();

    }
}