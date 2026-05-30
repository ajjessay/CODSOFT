import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        
        double width=0;
        double height=0;
        double area=0;

        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter the width of the rectangle:");
        width=scanner.nextDouble();

        System.out.print("Enter the height of the rectangle:");
        height=scanner.nextDouble();

        area=width*height;

        System.out.println("The area of the rectangle is:"+area + "cm²");





        scanner.close();
    }
}
