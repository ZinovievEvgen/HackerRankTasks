import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static boolean isAnagram(String a, String b) {

        char[] Array1 = a.toLowerCase().toCharArray();
        char[] Array2 = b.toLowerCase().toCharArray();

        Map<Character, Integer> let1 = new HashMap<>();
        Map<Character, Integer> let2 = new HashMap<>();

        for (int i = 0; i < Array1.length; i++) {
            Character t1 = Array1[i];

            if (!let1.containsKey(t1)) {
                let1.put(t1, 1);
            } else {
                let1.put(t1, let1.get(t1) + 1);
            }
        }

        for (int i = 0; i < Array2.length; i++) {
            Character t2 = Array2[i];

            if (!let2.containsKey(t2)) {
                let2.put(t2, 1);
            } else {
                let2.put(t2, let2.get(t2) + 1);
            }
        }

        if (let1.equals(let2)) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}



