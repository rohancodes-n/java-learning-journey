
import java.util.Scanner;

public class practiceset2 {
    public static void main(String[] args) {
        // problem 1:
        int a =10;
        if(a==11){
        System.out.println("Iam 11");
        }
        else
            {
            System.out.println("Iam not 11");

        }
        // problem 2:
        int m , p , c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in phy");
        p=sc.nextInt();
        System.out.println("Enter ur bio maths");
        m=sc.nextInt();
        System.out.println("chem");
        c=sc.nextInt();

        float avg = (p+m+c)/3.0f;
        if(avg>=40 && p>=33 && m>=33 &&c>=33){
            System.out.println("Congratulations ur are promoted");

        }
        else{
            System.out.println("Sorry u are not elgible for next class please try again");
        }
        //problem 3:
        System.out.println("HEllO Put ur income here I will tellt % ampunt u have to pay tax");
        float t = sc.nextFloat();
        if (t>=2.5 && t<=5){
            System.out.println("5% Tax");
        }
        else if (t>=5 && t<=10){
            System.out.println("20% tax u have to pay");
        }
        else if(t>=10){
            System.out.println("30% Tax");
        }
            else {
                System.out.println("NOTAX");
            }


            //problem 4:
            System.out.println("Enter num");
            int num = sc.nextInt();
            switch(num){
                case 1:
                    System.out.println("mon");
                    break;
                    case 2:
                        System.out.println("tue");
                        break;
                        case 3:
                            System.out.println("wed");
                            break;
                            case 4:
                                System.out.println("thurs");
                                break;
                            case 5:
                                System.out.println("fri");
                                break;
                            case 6:
                                System.out.println("sat");
                                break;
                            case 7:
                                System.out.println("sun");
                                break;
                                default:
                                    System.out.println("invalid");
            }



            //problem 5:
            
            System.out.println("Enter Website");
            String website = sc.nextLine();
            if(website.endsWith(".org")){
                System.out.println("organisation website");
            }
            else if(website.endsWith(".com")){
                System.out.println("commercial");


            }
            else if(website.endsWith(".in")){
                System.out.println("Indian website");
            }

            }
        }



    
    
