import java.util.Scanner;

public class ThirdLargest {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Length of the Array: ");
        int length = obj.nextInt();

        System.out.println("Enter the Elements of the Array: ");
        int[] array = new int[length];
        for(int i=0; i<length; i++)
            array[i] = obj.nextInt();
        int first = -1,second = -1, third = -1;
        for(int i=0; i<length; i++)
        {
            if(array[i] > first)
            {
                third = second;
                second = first;
                first = array[i];
            }
            else if(array[i] > second) {
                third = second;
                second = array[i];
            }
            else if(array[i] > third)
                third = array[i];
        }
        System.out.print("Third largest Value is: " + third);
    }
}
