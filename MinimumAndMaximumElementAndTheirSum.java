import java.util.Scanner;

public class MinimumAndMaximumElementAndTheirSum {
        static int maxLength = 100;
        public static void main(String[] args) {
            Scanner MinMax = new Scanner(System.in);
            int length;
            System.out.print("Enter the no of Elements that you want  to insert in the Array: ");
            length = MinMax.nextInt();
            int array[] = new int[maxLength];
            System.out.print("Enter the Data member of the Array: ");
            for (int i = 0; i < length; i++) {
                array[i] = MinMax.nextInt();
            }

            System.out.print("Data members of the Array is : ");
            for (int i = 0; i < length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            int min,max;
            min = max = array[0];
            for(int i=0 ;i<length; i++){
                if(array[i]<min)
                    min = array[i];
                else if(array[i] > max)
                    max = array[i];
            }
            System.out.print("Minimum Element is " + min + " Maximum Element " + max + " and the Sum of these two is " +(min + max));
    }
}
