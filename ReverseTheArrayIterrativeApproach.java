import java.util.Scanner;

public class ReverseTheArrayIterrativeApproach {
    static int maxLength = 100;
    public static void main(String[] args){
            Scanner reverseTheArray1 = new Scanner(System.in);
            int length;
            System.out.print("Enter the no of Elements that you want  to insert in the Array: ");
            length  = reverseTheArray1 .nextInt();
            int array[] = new int[maxLength];
            System.out.print("Enter the Data member of the Array: ");
            for (int  i =0; i<length; i++){
                array[i] = reverseTheArray1 .nextInt();
            }

            System.out.print("Data members of the Array is : ");
            for (int  i =0; i<length; i++){
                System.out.print(array[i] + " ");
            }

        System.out.println();
            //Logic for Reversal Using Iterative Approach
        int start = 0 , end = length -1 ;
            while (start < end){
                array[start] = array[start] + array[end];
                array[end] = array[start] - array[end];
                array[start] = array[start] - array[end];

                start++;
                end--;
            }
        System.out.println("New Array is : ");
        for (int  i =0; i<length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
