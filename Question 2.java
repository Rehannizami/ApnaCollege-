import java.util.*;
 
public class App {
    public static void main(String args[]) 
    {
        int N, i, sum = 1;
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        N = in.nextInt();
 
        for(i = 1; i <= N; i++){
            if((i%2) == 1){
                sum += i;
            }
        }
     
        System.out.print("Sum of all odd numbers between 0 to "
            + N + " = " + sum);
    }
}