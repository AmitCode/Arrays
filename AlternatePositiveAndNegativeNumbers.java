import java.util.Scanner;

public class AlternatePositiveAndNegativeNumbers {
    static void alternatePositiveNegative(int[] arr){
        int n = arr.length;
        int[] tempArray = new int[n];
        int start=0,end=n-1;
        int i=0;
        int pos=0;
        while (i<n){
            if(arr[i] >= 0){
                tempArray[start]=arr[i];
                start++;
                pos++;
            }
            else {
                tempArray[end] = arr[i];
                end--;
            }
            i++;
        }

        int right=n-1;
        start=0;
        i=0;
        while (i<n){
            if(i%2!=0 && right>end && pos!=0){
               arr[i] = tempArray[right];
              right--;
            }
            else {
                arr[i] = tempArray[start];
                start++;
                pos--;
            }
            i++;
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Length of the Array: ");
        int n = obj.nextInt();

        System.out.println("Enter the Elements of the Array: ");
        int[] a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = obj.nextInt();
        alternatePositiveNegative(a);
        for(int i=0; i<n;i++){
            System.out.print(a[i] +" ");
        }
    }
}
