import java.util.Scanner;

public class PalindromicArray {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no of test cases: ");
        int testCases = obj.nextInt();

        while (testCases>0)
        {
            System.out.print("Enter the Length of the Array: ");
            int length = obj.nextInt();

            System.out.println("Enter the Elements of the Array: ");
            int[] array = new int[length];
            for(int i=0; i<length; i++)
                array[i] = obj.nextInt();
            int flag=1;
            for(int i=0;i<length;i++){
                int reminder=0,reverse=0;
                int number=array[i];
                        while(number > 0){
                            reminder=number % 10;
                            reverse = reverse * 10 + reminder;
                            number /= 10;
                        }
                        if(array[i] != reverse){
                            flag =0;
                            break;

                        }

            }
            if(flag==1)
                System.out.println(1);
            else
                System.out.println(0);
            testCases--;
        }
    }
}
