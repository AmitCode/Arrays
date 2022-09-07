import java.util.Scanner;

public class TwoDiamensionalArray {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the rows and columns of the Array: ");
        int row = obj.nextInt();
        int column = obj.nextInt();
        int[][] array = new int[row][column];
        for(int i=0;i<row;i++)
            for(int j=0;j<column;j++)
                array[i][j] = obj.nextInt();

        System.out.print("The Array is: \n");
        for(int i=0;i<row;i++) {
            for (int j = 0; j < column; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}
