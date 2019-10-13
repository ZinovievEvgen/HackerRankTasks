import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
                int x = in.nextInt();
                int y = in.nextInt();
            if (y == 0) {
               throw new  ArithmeticException("/by zero");
            }
            else {
                int result = x/y;
                System.out.println(result);
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        }
        catch (ArithmeticException a){
            System.out.println(a);
    }
}
}
