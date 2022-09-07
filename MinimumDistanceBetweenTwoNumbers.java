import java.util.Scanner;

public class MinimumDistanceBetweenTwoNumbers {
    static int minDistance(int[] array, int num1, int num2){
        int minDistance = -1;
        int index1=0, index2=0,i=0;
        int count = 0;
        while (i < array.length){
            if(array[i] == num1)
                index1 = i;
            else if(array[i] == num2)
                index2 = i;
            if(array[index1] == num1 && array[index2] == num2){
                if(index1 < index2)
                {
                    if(count > 0)
                    {
                        if((index2 - index1) < minDistance)
                            minDistance = index2 - index1;
                    }
                    else
                        minDistance = index2 - index1;
                }
                else
                    if(count > 0)
                    {
                        if((index1 - index2) < minDistance)
                            minDistance = index1 - index2;
                    }
                    else
                        minDistance = index1 - index2;
            }
            i++;
        }
        return minDistance;
    }
    public static void main(String[] args){
        Scanner distance = new Scanner(System.in);
        System.out.print("Enter the Length of the Array: ");
        int arrayLength = distance.nextInt();
        int[] array = new int[arrayLength];
        System.out.print("Enter the Elements of the Array: ");
        for (int i=0; i<arrayLength; i++)
            array[i]  = distance.nextInt();
        System.out.print("Enter two numbers: ");
        int num1 = distance.nextInt();
        int num2 = distance.nextInt();
        int minDistance = minDistance(array,num1,num2);
        System.out.println("Minimum Distance between " + num1 + " and " + num2 + " is " + minDistance);

    }
}
