import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, List<Integer>> mapa = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            int d = scan.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int j = 1; j <= d; j++) {
                int value = scan.nextInt();
                arr.add(value);
            }
            mapa.put(i, arr);
        }
        System.out.println("*****************************");
        System.out.println("Выводим коллекции:");
        for (int a = 1; a <= mapa.size(); a++) {
            System.out.println(mapa.get(a));
        }
        System.out.println("**************************");
        System.out.println("Output:");
        int q = scan.nextInt();
        for (int b = 0; b < q; b++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x == 0 | y == 0 | mapa.get(x).size() < y) {
                System.out.println("ERROR!");
            } else {
                System.out.println(mapa.get(x).get(y - 1));
            }
        }
    }
}
