import java.util.ArrayList;
import java.util.Scanner;

public class UnionOfrTwoSortedArray{
    static void union(int[] arr1, int n, int[] arr2, int m){
        ArrayList<Integer> result = new ArrayList<>();
        int prev =0;
        int j=0,k=0;
        while (j<n && k<m){
            if(arr1[j] == arr2[k]){
                if((prev==0 || arr2[k] != prev))
                {
                    result.add(arr1[j]);
                    prev=result.get(result.size()-1);
                }
                j++;
                k++;
            }
            else if(arr1[j] < arr2[k]){
                if((prev==0 || arr1[j] != prev))
                {
                    result.add(arr1[j]);
                    prev=result.get(result.size()-1);
                }
                j++;
            }
            else if(arr1[j] > arr2[k]){
                if((prev==0 || arr2[k] != prev))
                {
                    result.add(arr2[k]);
                    prev=result.get(result.size()-1);
                }
                k++;
            }
        }

        while (j<n ){
            if((arr1[j] != prev))
            {
                result.add(arr1[j]);
                prev=result.get(result.size()-1);
            }
            j++;
        }
        while (k<m){
            if((arr2[k] != prev))
            {
                result.add(arr2[k]);
                prev=result.get(result.size()-1);
            }
            k++;
        }
        int i=0;
        while (i<result.size())
        {
            System.out.print(result.get(i) +" ");
            i++;
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Length of First the Array: ");
        int n = obj.nextInt();

        System.out.println("Enter the Elements of First the Array: ");
        int[] a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = obj.nextInt();
        System.out.print("Enter the Length of the Second Array: ");
        int m = obj.nextInt();
        System.out.println("Enter the Elements of Second the Array: ");
        int[] b = new int[m];
        for(int i=0; i<m; i++)
            b[i] = obj.nextInt();
        union(a,n,b,m);
    }
}
