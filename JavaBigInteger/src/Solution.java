import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger Ab = scan.nextBigInteger();
        BigInteger Bb = scan.nextBigInteger();

        System.out.println(Ab.add(Bb));
        System.out.println(Ab.multiply(Bb));
    }
}
