import java.util.Scanner;

public class ReverseArrayInGroups {

    static void swap(int array[], int start, int end){
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

    static void reverseArrayGroup(int array[], int arrayLength, int sizeOfSubArray){
        for(int i =0; i<arrayLength; i = i+sizeOfSubArray){
            int start = i;
            int end ;
            if((i + sizeOfSubArray) >= arrayLength)
                end = arrayLength-1;
            else if(arrayLength - i == 1)
                break;
            else
                end = (i + sizeOfSubArray) - 1;
            while (start < end){
                swap(array, start, end);
                start ++ ;
                end --;
            }
        }
    }

    public static void main(String[] args){
        Scanner reverseGroupInput = new Scanner(System.in);
        System.out.print("Enter the Length of the Array : ");
        int arrayLength = reverseGroupInput.nextInt();
        int[] array = new int[arrayLength];

        System.out.print("Enter the Elements of the Array : ");
        for (int i = 0; i<arrayLength; i++)
            array[i] = reverseGroupInput.nextInt();

        System.out.print("Enter the Size of the Sub Array: ");
        int sizeOfSubArray = reverseGroupInput.nextInt();

        reverseArrayGroup(array, arrayLength, sizeOfSubArray);

        System.out.print("The New Reversed Array is : ");
        for(int i = 0; i<arrayLength; i++)
            System.out.print(array[i] + " ");
    }
}
