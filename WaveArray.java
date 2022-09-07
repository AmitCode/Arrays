import java.util.Scanner;

public class WaveArray {
    public static void swap(int array[], int i ,int k){
        int temp =array[i];
        array[i] = array[k];
        array[k] = temp;
    }
    public static void main(String[] args){
        Scanner waveArray = new Scanner(System.in);
        System.out.print("Enter the Length of the Array: ");
        int arrayLength = waveArray.nextInt();
        int[] array = new int[arrayLength];
        System.out.print("Enter the Elements of the Array: ");
        for (int i=0; i<arrayLength; i++)
            array[i]  = waveArray.nextInt();

        for(int i=0; i<arrayLength-1;i+=2){
            if(array[i] < array[i+1])
                swap(array, i, i+1);
        }

        System.out.println("The New Resulted Array in Sorted Order in Wave Form: ");
        for (int i=0; i<arrayLength; i++)
            System.out.print(array[i] + " ");
    }
}
