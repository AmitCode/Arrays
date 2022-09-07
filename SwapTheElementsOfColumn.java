import java.util.Scanner;

public class SwapTheElementsOfColumn {
    public static void swap(int[][] array,int row,int start, int column){
        int end = column-1;
        while (start <= end){
            int temp  = array[row][start];
            array[row][start] = array[row][end];
            array[row][end] = temp;
            start++;
            end--;
        }
    }
        public static void main(String[] args){
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter the rows and columns of the Array: ");
            int r = obj.nextInt();
            int c = obj.nextInt();
            int[][] a = new int[c][c];
            for(int i=0;i<r;i++)
                for(int j=0;j<c;j++)
                    a[i][j] = obj.nextInt();
            int k=0;
            while (k<r){
                swap(a,k,0,c);
                k++;
            }

            System.out.print("The Array is: \n");
            for(int i=0;i<r;i++) {
                for (int j = 0; j < c; j++)
                    System.out.print(a[i][j] + " ");
                System.out.println();
            }
        }
}
