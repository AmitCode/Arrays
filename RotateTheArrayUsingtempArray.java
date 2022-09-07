import java.util.Scanner;

public class RotateTheArrayUsingtempArray {
    static int maxLength = 100;
    public static void main(String[] args) {
        Scanner rotateSet1 = new Scanner(System.in);
        int length;
        System.out.print("Enter the no of Elements that you want  to insert in the Array: ");
        length = rotateSet1.nextInt();
        int array[] = new int[maxLength];
        System.out.print("Enter the Data member of the Array: ");
        for (int i = 0; i < length; i++) {
            array[i] = rotateSet1.nextInt();
        }

        System.out.print("Data members of the Array is : ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //Rotation Logic
        System.out.print("Enter that how many time you want to rotate the Array: ");
        int k = rotateSet1.nextInt();
        int temp[] = new int[length];
        int j = 0;
        for(int i =k; i<length; i++){
            temp[j] = array[i];
            j++;
        }
        for(int i =0; i<k; i++){
            temp[j] = array[i];
            j++;
        }

        System.out.print("Data members of the Array is : ");
        for (int i = 0; i < length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
