import java.util.Scanner;

public class CountOddEvenInTheArray {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Length of the Array: ");
        int length = obj.nextInt();

        System.out.println("Enter the Elements of the Array: ");
        int[] array = new int[length];
        for(int i=0; i<length; i++)
            array[i] = obj.nextInt();
        int odd=0,even=0;
        for(int i=0;i<length;i++){
            if(array[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.print("No of Even: "+ even + " No of Odd: " +odd);
    }
}
