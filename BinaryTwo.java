import java.util.EmptyStackException;
import java.util.Scanner;

public class BinaryTwo
{

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        String binary = in.nextLine();
        System.out.println(binaryToInteger(binary));
    }

    public static int binaryToInteger(String binary) {
        char[] numbers = binary.toCharArray();
        int result = 0;
        for(int i=numbers.length - 1; i>=0; i--)
            if(numbers[i]=='1')
                result += Math.pow(2, (numbers.length-i - 1));
        return result;
    }
}