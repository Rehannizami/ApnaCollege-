import java.util.*;

class Main{
    public static void main(String[]args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number");
            int num1= sc.nextInt();
            System.out.println("Enter the second number");
            int num2=  sc.nextInt();
            System.out.println("Enter the third number");
            int num3= sc.nextInt();

            int avg= (num1+num2+num3)/3;
            
            System.out.println("The average of the given numbers are: "+avg);
        }
        
    }

}