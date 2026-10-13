
import java.util.Scanner;

public class Day03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. String Declaration
        String name = "Rohan";
        String city = "Pune";

        System.out.println("Name: " + name);
        System.out.println("City: " + city);

        // 2. String Concatenation
        String firstName = "Rohan";
        String lastName = "Masne";

        System.out.println(firstName + " " + lastName);
        System.out.println("Hello " + name);

        // 3. String Length
        System.out.println("Length: " + name.length());
        System.out.println("Length of Java: " + "Java".length());

        // 4. charAt()
        String word = "Harry";

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(4));

        // 5. indexOf()
        String fruit = "banana";

        System.out.println(fruit.indexOf("a"));
        System.out.println(fruit.indexOf("n"));
        System.out.println(fruit.indexOf("z"));

        // 6. lastIndexOf()
        System.out.println(fruit.lastIndexOf("a"));
        System.out.println(fruit.lastIndexOf("n"));

        // 7. toUpperCase()
        String language = "java";

        System.out.println(language.toUpperCase());

        // 8. toLowerCase()
        String subject = "JAVA";

        System.out.println(subject.toLowerCase());

        // 9. trim()
        String message = "   Hello Java   ";

        System.out.println(message.trim());

        // 10. substring()
        String course = "Programming";

        System.out.println(course.substring(3));
        System.out.println(course.substring(0, 7));

        // 11. replace()
        String text = "banana";

        System.out.println(text.replace("a", "o"));

        // 12. contains()
        String sentence = "I am learning Java";

        System.out.println(sentence.contains("Java"));
        System.out.println(sentence.contains("Python"));

        // 13. equals()
        String a = "Java";
        String b = "Java";
        String c = "java";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        // 14. equalsIgnoreCase()
        System.out.println(a.equalsIgnoreCase(c));

        // 15. User Input
        System.out.print("Enter your full name: ");
        String userName = sc.nextLine();

        System.out.println("Welcome " + userName);
        System.out.println(
            "Your name length is " + userName.length()
        );

        sc.close();
    }
}
