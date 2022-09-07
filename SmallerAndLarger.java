import java.util.Scanner;

public class SmallerAndLarger {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Length of the Array: ");
        int length = obj.nextInt();

        System.out.println("Enter the Elements of the Array: ");
        int[] array = new int[length];
        for(int i=0; i<length; i++)
            array[i] = obj.nextInt();
        int smaller = array[0],larger = array[0];
        for(int i=1;i <length; i++){
            if(array[i] > larger)
            {
                larger = array[i];
            }
            else if(array[i] < smaller)
                smaller = array[i];
        }
        System.out.println("The Smaller Element is: " +smaller + " and Larger Element is: " +larger);

        //The Problem is count  the smaller and grater element to a given element.
        System.out.print("Enter the element: ");
        int number  = obj.nextInt();
        smaller = larger = 0;
        for(int i=0;i <length; i++){
            if(array[i] >= number)
            {
                larger++;
            }
            else if(array[i] <= number)
                smaller++;
        }
        System.out.println("No of  Smaller Element is: " +smaller + " and No of Larger Element is: " +larger);
    }
}
