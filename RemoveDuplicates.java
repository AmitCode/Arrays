import java.util.Scanner;

public class RemoveDuplicates {
    static  int remove_duplicate(int A[],int N){
        if(N==0 || N==1)
            return N;
        int result=0;
        int i=0;
        while(i<N-1){
            if(A[i] != A[i+1]){
                A[result] = A[i];
                result++;
            }
            i++;
        }
        A[result] = A[N-1];
        return (result+1);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length the Array: ");
        int length = obj.nextInt();
        System.out.println("Enter the Elements the Array: ");
        int[] a = new int[length];
        for(int j=0;j<length;j++)
            a[j] = obj.nextInt();
        int newLength = remove_duplicate(a,length);
        System.out.print("New Array is: \n");
        for(int j=0;j<newLength;j++)
            System.out.print(a[j] + " ");
    }
}
