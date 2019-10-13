import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        List<String> list = new ArrayList<>();
        for (String str : s.trim().split("[ !,?._'@]+")) {
            list.add(str);
        }
        if (s == null || s.trim().equals("")) {
            System.out.println("0");
        }
        else{
            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }
        }
        scan.close();
    }
}
