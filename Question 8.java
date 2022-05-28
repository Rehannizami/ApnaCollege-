import java.util.*;

class App
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("x:\t Will be the index\nn:\t Will be the power");
            System.out.println("Enter the value of x");
            double x= sc.nextInt();
            System.out.println("Enter the value of n");
            double n = sc.nextInt();
            System.out.println("The answer is "+Math.pow(x, n));
        }
    }
}