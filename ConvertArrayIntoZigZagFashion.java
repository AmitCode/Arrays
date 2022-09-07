import java.util.Scanner;

public class ConvertArrayIntoZigZagFashion {
    static void swap(int arrar[], int j, int k){
        int temp = arrar[j];
        arrar[j] = arrar[k];
        arrar[k] = temp;
    }
    public static void main(String[] args){
        Scanner zigZag = new Scanner(System.in);
        System.out.print("Enter the Length of the Array: ");
        int arrayLength = zigZag.nextInt();
        int[] array = new int[arrayLength];
        System.out.print("Enter the Elements of the Array: ");
        for (int i=0; i<arrayLength; i++)
            array[i]  = zigZag.nextInt();
        boolean flag = true;
        for (int i=0; i<arrayLength-1; i++){
            if(flag == true && array[i] > array[i+1]){
                swap(array,i,i+1);
                flag = false;
            }
            else if(flag == true && array[i] < array[i+1])
                flag = false;
            else if(flag == false && array[i] < array[i+1]){
                swap(array,i,i+1);
                flag = true;
            }
            else
                flag = true;
        }

        System.out.println("The New Resulted Array in Zig Zag fashion: ");
        for (int i=0; i<arrayLength; i++)
            System.out.print(array[i] + " ");
    }
}
