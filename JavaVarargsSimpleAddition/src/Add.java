public class Add {
    public Add() {

    }

    public void add(int... args) {
        int summ = args[0];
        String str = "";
        System.out.print(args[0]);
        for (int i = 1; i < args.length; i++) {
            System.out.print("+" + args[i]);
            summ += args[i];
        }
        System.out.println("=" + summ);
    }
}
