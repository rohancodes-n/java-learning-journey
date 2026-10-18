import java.util.Random;
import java.util.Scanner;
public class game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("STONE PAPER SCISSORS");
        System.out.println("1 . Stone");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("Enter your choice");
        int user = sc.nextInt();
        int computer = random.nextInt(3)+1;
        System.out.println("Ur choice "+user);
        System.out.println("computer choice"+computer);
        if((user==1 && computer==3)||(user==2 && computer ==1)||(user==3 && computer==2)){
            System.out.println("Congratulations");

        }
        else{
            System.out.println("Computer wins");
        }
        sc.close();

        
    }
}
