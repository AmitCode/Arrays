import java.util.Scanner;

public class Sort012 {
    static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static void sort(int[] array){
        int i=0;
        int low=0, high = array.length - 1, mid = 0;
        while (i <= high){
            if(array[i] == 0){
                swap(array,i,low);
                low++;
                i++;
            }
            else if(array[i] == 1){
                i++;
            }
            else if(array[i] == 2)
            {
                swap(array,i,high);
                high--;
            }
        }
    }
    public static void main(String[] args){
        Scanner sort012 = new Scanner(System.in);
        System.out.print("Enter the Length of the Array: ");
        int arrayLength = sort012.nextInt();
        int[] array = new int[arrayLength];
        System.out.print("Enter the Elements of the Array: ");
        for (int i=0; i<arrayLength; i++)
            array[i]  = sort012.nextInt();

        sort(array);
        System.out.println("The New Resulted Array in Sorted Order: ");
        for (int i=0; i<arrayLength; i++)
            System.out.print(array[i] + " ");
    }
}
