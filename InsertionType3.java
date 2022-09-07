import java.util.Scanner;

//This is a program for inserting an Element at the Last Position.
public class InsertionType3 {
    static int maxLength = 100;
    public static void main(String args[]){
        Scanner insertionType3 = new Scanner(System.in);
        int length;
        System.out.print("Enter the no of Elements that you want  to insert in the Array: ");
        length  = insertionType3.nextInt();
        int array[] = new int[maxLength];
        System.out.print("Enter the Data member of the Array: ");
        for (int  i =0; i<length; i++){
            array[i] = insertionType3.nextInt();
        }

        System.out.print("Data members of the Array is : ");
        for (int  i =0; i<length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int newElement;
        System.out.print("Enter the new element that you want to insert int the Array: ");
        newElement = insertionType3.nextInt();

        if(length ==0){
            System.out.println("Array is Empty!");
        }
        else {
            length = length + 1;
            array[length-1] = newElement;
        }

        System.out.println("New Element " + newElement + " is inserted at the 0 position! and the new Array is : ");
        for (int  i =0; i<length; i++){
            System.out.print(array[i] + " ");
        }

    }

}
