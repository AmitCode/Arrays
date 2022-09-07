import java.util.Scanner;

public class ReverseTheArrayRecursiveApproach {
    static int maxLength = 100;
    public static void main(String[] args) {
        Scanner reverseTheArray2 = new Scanner(System.in);
        int length;
        System.out.print("Enter the no of Elements that you want  to insert in the Array: ");
        length = reverseTheArray2.nextInt();
        int array[] = new int[maxLength];
        System.out.print("Enter the Data member of the Array: ");
        for (int i = 0; i < length; i++) {
            array[i] = reverseTheArray2.nextInt();
        }

        System.out.print("Data members of the Array is : ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }

        Reverse(array,0,length-1);
        System.out.println();

        System.out.println("New Array is : ");
        for (int  i =0; i<length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void Reverse(int array[],int start, int end){
        if(start >= end){
            return;
        }
        array[start] = array[start] + array[end];
        array[end] = array[start] - array[end];
        array[start] = array[start] - array[end];

        Reverse(array,start+1,end-1);
    }
}
