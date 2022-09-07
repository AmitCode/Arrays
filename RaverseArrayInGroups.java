import java.util.Scanner;

public class RaverseArrayInGroups {
    int maxLength =100;
    public static void main(String[] args) {
        Scanner reverseGroup = new Scanner(System.in);
        int length;
        System.out.print("Enter the no of Elements that you want  to insert in the Array: ");
        length = reverseGroup.nextInt();
        int array[] = new int[length];
        System.out.print("Enter the Data member of the Array: ");
        for (int i = 0; i < length; i++) {
            array[i] = reverseGroup.nextInt();
        }

        System.out.print("Data members of the Array is : ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the size of the Sub Array: ");
        int sizeSub = reverseGroup.nextInt();

        for(int i = 0; i<length; i+=sizeSub){
            int start = i;
            int end = 0;
            if(start + sizeSub-1 > length-1)
                end = length - 1;
            else
                end = i + sizeSub - 1;
            while (start < end){
                array[start] = array[start] + array[end];
                array[end] = array[start] - array[end];
                array[start] = array[start] - array[end];
                start++;
                end--;
            }
        }
        System.out.print("Data members of the Array is : ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
