import java.util.Scanner;
//This is a program for inserting an Element at the Given Position.
public class InsertionType2 {
    static int maxLength = 100;
    public static void main(String args[]) {
        Scanner insertionType2 = new Scanner(System.in);
        int length;
        System.out.print("Enter the no of Elements that you want  to insert in the Array: ");
        length = insertionType2.nextInt();
        int array[] = new int[maxLength];
        System.out.print("Enter the Data member of the Array: ");
        for (int i = 0; i < length; i++) {
            array[i] = insertionType2.nextInt();
        }

        System.out.print("Data members of the Array is : ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int newElement, newElementPosition;
        System.out.print("Enter the new element that you want to insert int the Array and the position at which you want to insert the element: ");
        newElement = insertionType2.nextInt();
        newElementPosition = insertionType2.nextInt();
        if(length == maxLength)
            System.out.println("Array is Full!");
        else{
            length += 1;
            for (int i = length; i>=newElementPosition; i--){
                array[i] = array[i-1];
            }
            array[newElementPosition-1] = newElement;
            System.out.println("New Element " +newElement + " is inserted at the "+ newElementPosition + " position! and the new Array is " );
            for (int i = 0; i < length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
