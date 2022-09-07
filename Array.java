import java.util.Scanner;

public class Array {
    static int maxLength = 100;
    public static void main(String[] args){
        Scanner object  = new Scanner(System.in);
        int length;
        System.out.print("Enter the Length of the Array: ");
        length = object.nextInt();
        int array[] = new int[length];
        System.out.print("Enter the data members of the Array: ");
        for(int i =0; i<length; i++){
            array[i] = object.nextInt();
        }
        System.out.print("The Array is : ");
        for (int i =0; i<length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
