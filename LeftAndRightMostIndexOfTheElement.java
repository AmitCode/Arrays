import java.util.Scanner;

public class LeftAndRightMostIndexOfTheElement {
    public static void leftAndRight(int[] array, int length,int x){
        int left=-1 ,right=-1;
        int start=0,end=array.length-1;
        while(start <= end){
            if(array[start] == x && left==-1)
            {
                left=start;
                break;
            }
            start++;
        }
        start--;
        while(end >=start){
            if(array[end] == x && right==-1)
            {
                right=end;
                break;
            }
            end--;

        }
        System.out.print(left +" " + right);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length the Array: ");
        int length = obj.nextInt();
        System.out.println("Enter the Elements the Array: ");
        int[] a = new int[length];
            for(int j=0;j<length;j++)
                a[j] = obj.nextInt();
        System.out.println("Enter the Element");
        int x= obj.nextInt();
       leftAndRight(a,length,x);
    }
}
