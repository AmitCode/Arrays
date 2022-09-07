import java.util.Scanner;

public class IndexOfOneExtraElement {
    static int findAnExtraElement(int[] a, int[] b){
        int result = -1;
        int start=0,end = a.length-1;
        while (start <end){
            int mid = (start + end)/2;
            if(a[start] != b[start])
            {
                System.out.println("Start is "+a[start]);
                return start;
            }
            else if(a[end] != b[end-1])
            {
                System.out.println("End is :" +a[end]);
                return end;
            }
            start++;
            end--;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Length of First the Array: ");
        int al = obj.nextInt();

        System.out.println("Enter the Elements of First the Array: ");
        int[] a = new int[al];
        for(int i=0; i<al; i++)
            a[i] = obj.nextInt();
        System.out.println("Enter the Elements of Second the Array: ");
        int[] b = new int[al-1];
        for(int i=0; i<al-1; i++)
            b[i] = obj.nextInt();
       int result =   findAnExtraElement(a,b);
        System.out.print("Extra Element is: " +a[result]);
    }
}
