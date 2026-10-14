
import java.util.Scanner;

public class practiceset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Convert to lowercase
        System.out.println("Enter anything. I will convert it to lowercase");

        String a = sc.nextLine();
        System.out.println(a.toLowerCase());

        // 2. Replace spaces with underscore
        String J = "HELLO WORLD";
        String r = J.replace(" ", "_");

        System.out.println(r);

        // 3. Replace name in a letter
        String letter = "Dear <|name|>, Thanks a lot";

        letter = letter.replace("<|name|>", "Harry");

        System.out.println(letter);

        sc.close();

        // problem 4:
        String myletter = "Dear harry \n \tThis java course is nice.\n \tThanks";
        System.out.println(myletter);

       
    }
}
