import java.util.Scanner;

public class ReplaceAllZerosWith5{
        public static void main(String[] args){
                Scanner obj = new Scanner(System.in);
                System.out.print("Enter a Number: ");
                int number = obj.nextInt();
                String temp1 = Integer.toString(number);
                char[] charArray = temp1.toCharArray();
                for(int i=0; i<charArray.length; i++){
                        if(charArray[i] == '0')
                                charArray[i] = '5';
                }
                String newString = new String(charArray);
                int result = Integer.parseInt(newString);
                System.out.println(result);
        }
}
