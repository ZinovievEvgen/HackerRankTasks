public class MyCalculator {
    long power(int a, int b) throws Exception {
        long ab = 0;
        if(a < 0 || b <0){
            throw new Exception("n or p should not be negative");
        }
        else if(a == 0 & b == 0){
            throw new Exception("n and p should not be zero");
        }
        else {
            ab = (long)Math.pow(a, b);
            return ab;
        }
    }
}
