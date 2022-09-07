import java.util.Scanner;
//This is a program for deleting an Element at the given Position.
public class DeletionType2 {
    static int maxLength = 100;
    public static void main(String args[]){
        Scanner deletionType2 = new Scanner(System.in);
        int length;
        System.out.print("Enter the no of Elements that you want  to insert in the Array: ");
        length  = deletionType2 .nextInt();
        int array[] = new int[maxLength];
        System.out.print("Enter the Data member of the Array: ");
        for (int  i =0; i<length; i++){
            array[i] = deletionType2 .nextInt();
        }

        System.out.print("Data members of the Array is : ");
        for (int  i =0; i<length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int deletingElementPosition;
        System.out.print("Enter the position of the  element that you want to delete int the Array: ");
        deletingElementPosition = deletionType2 .nextInt();
        if(length == 0){
            System.out.println("Array is Empty!");
        }
        else {
            for(int i=deletingElementPosition-1; i<length; i++){
                array[i] = array[i+1];
            }
            length = length - 1;
            System.out.println("The new Array is : ");
            for (int  i =0; i<length; i++){
                System.out.print(array[i] + " ");
            }
        }
    }
}
