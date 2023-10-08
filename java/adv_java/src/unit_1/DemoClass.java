package unit_1;
import java.util.Scanner;

public class DemoClass {

    public static void main(String[] args) {
        System.out.println("First java program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Name " + name);
    }

}
