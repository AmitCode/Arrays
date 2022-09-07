import java.util.Scanner;

public class MoveAllNegativeNumbersAtTheEnd {
    static void swap(int[] tempArray, int end,int n){
        int start = end + 1;
        end = n;
        while (start <= end){
            int temp = tempArray[start];
            tempArray[start] = tempArray[end];
            tempArray[end] = temp;
            start++;
            end--;
        }
    }
    static void move(int[] array){
        int[] tempArray = new int[array.length];
        int i=0,start=0,end=array.length-1;
        while (i< array.length) {
            if (array[i] >= 0) {
                tempArray[start] = array[i];
                start++;
            } else {
                tempArray[end] = array[i];
                end--;
            }
            i++;
        }
        swap(tempArray,end,array.length-1);

        for(int k=0;k<array.length;k++){
            array[k] = tempArray[k];
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Length of the Array: ");
        int length = obj.nextInt();

        System.out.println("Enter the Elements of the Array: ");
        int[] array = new int[length];
        for(int i=0; i<length; i++)
            array[i] = obj.nextInt();
        move(array);

        for(int i=0; i<length; i++)
            System.out.print(array[i] + " ");
    }
}
