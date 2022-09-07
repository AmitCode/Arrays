import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Length of the Array: ");
        int length = obj.nextInt();

        System.out.println("Enter the Elements of the Array: ");
        int[] array = new int[length];
        for(int i=0; i<length; i++)
            array[i] = obj.nextInt();
        int first=0, second = 0;
        if(array[0] > array[1])
        {
            first=array[0];
        }
        else
        {
            first=array[1];
        }
        second = -1;//May there will be an array where all the elements are s
        // ame in that case there will be no larger element that's why second will be -1.
        int i=0;
        while (i<length){
            if(array[i] > first){
               second = first;
               first = array[i];
            }
            else if(array[i] > second && array[i] < first)
                second = array[i];
            i++;
        }
        System.out.print("Second Largest Element is: " +second);
    }
}
