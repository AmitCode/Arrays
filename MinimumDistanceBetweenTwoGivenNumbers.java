import java.util.Scanner;

public class MinimumDistanceBetweenTwoGivenNumbers {
    public static void main(String[] args){
        Scanner minimumDistance = new Scanner(System.in);
        System.out.print("Enter the length of the Array: ");
        int length = minimumDistance.nextInt();
        int array[] = new int[length];
        System.out.print("Enter the elements of the Array: ");
        for (int i = 0; i<length; i++)
        {
            array[i] = minimumDistance.nextInt();
        }

        System.out.print("Enter two numbers: ");
        int x = minimumDistance.nextInt();
        int y = minimumDistance.nextInt();

        int tempIndex;
        int distance=-1;
        int index1=-1,index2 = -1;
        for(int i = 0; i<length; i++){
            if(array[i] == x)
                index1 = i;
            else if(array[i] == y)
                index2 = i;
            if(index1 > -1 && index2 > -1)
            {
                if(distance == -1)
                    distance = Math.abs(index1 -index2);
                else if(Math.abs(index1-index2) < distance)
                    distance = Math.abs(index1 -index2);
            }
        }
        System.out.println("Minimum Distance is: " +distance);
    }
}
