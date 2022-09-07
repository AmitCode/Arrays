import java.util.Scanner;

public class PrintAlternateElementOfArray {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Length of the Array: ");
        int length = obj.nextInt();

        System.out.println("Enter the Elements of the Array: ");
        int[] array = new int[length];
        for(int i=0; i<length; i++)
            array[i] = obj.nextInt();

        System.out.print("Array Elements in the Alternate Order: ");
        int i=0;
        while (i<length){
            System.out.print(array[i] +" ");
            i+=2;
        }
    }
}
