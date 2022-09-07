import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] agrs){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long result  = obj.nextInt();
        result = (result * ( result + 1 ))/2;
        System.out.print("Sum of Series is: " + result);
    }
}
