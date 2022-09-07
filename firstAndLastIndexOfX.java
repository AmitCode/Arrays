import java.util.Scanner;

public class firstAndLastIndexOfX {
    public static void main(String[] args){
        Scanner firstLast = new Scanner(System.in);
        System.out.print("Enter the length of the Array: ");
        int arrayLength = firstLast.nextInt();
        System.out.print("Enter the Elements of the Array: ");
        int[] array = new int[arrayLength];
        for (int i=0; i<arrayLength; i++){
            array[i] = firstLast.nextInt();
        }

        System.out.println("Enter the Element:");
        int x = firstLast.nextInt();
        int mid;
        int start= 0 , end = arrayLength-1;
        int firstIndex= -1, lastIndex = -1;
        while (start <= end){
            mid = (start + end)/2;
            if(array[mid] == x ){
                firstIndex = mid;
                end = mid -1;
            }
            else if(array[mid] > x)
                end = mid - 1;
            else
                start = mid + 1;

        }

        start= 0;
        end = arrayLength-1;
        while (start <= end){
            mid = (start + end)/2;
            if(array[mid] == x){
                lastIndex = mid;
                start = mid + 1;
            }
            else if(array[mid] > x)
                end = mid - 1;
            else
                start = mid + 1;
        }
        System.out.println("First Index of " + x + " is " + firstIndex + " and Last Index is " +lastIndex);
    }
}
