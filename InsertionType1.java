import java.util.Scanner;

//This is a program for inserting an Element at the Starting Position.
public class InsertionType1 {
    static int maxLength = 100;
    public static void main(String args[]){
        Scanner insertionType1 = new Scanner(System.in);
        int length;
        System.out.print("Enter the no of Elements that you want  to insert in the Array: ");
        length  = insertionType1.nextInt();
        int array[] = new int[maxLength];
        System.out.print("Enter the Data member of the Array: ");
        for (int  i =0; i<length; i++){
            array[i] = insertionType1.nextInt();
        }

        System.out.print("Data members of the Array is : ");
        for (int  i =0; i<length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int newElement;
        System.out.print("Enter the new element that you want to insert int the Array: ");
        newElement = insertionType1.nextInt();

        if(length == maxLength){
            System.out.println("Array is full!");
        }
        else {
            length = length + 1;
            for (int i = length; i>=1; i--){
                array[i] = array[i-1];
            }
            array[0] = newElement;
        }

        System.out.println("New Element " + newElement + " is inserted at the 0 position! and the new Array is : ");
        for (int  i =0; i<length; i++){
            System.out.print(array[i] + " ");
        }

    }

}
