import java.util.Scanner;

class App
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the age of the person");
            int age= sc.nextInt();
            if(age>18)
            {
                System.out.println("Youa are egligible to vote");
            }
            if(age<18)
            {
                System.out.println("Sorry. You cannot vote now");
            }
        }
    }
}