import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        int del = scan.nextInt();
        for (int k = 1; k <= del; k++) {
            String Line = scan.next();
            if (Line.equals("Insert")) {
                int indIns = scan.nextInt();
                int val = scan.nextInt();

                list.add(indIns,val);
                /*if (indIns >= list.size()) {
                    list.add(val);
                } else {
                    list.set(indIns, val);
                }*/
            } else if (Line.equals("Delete")) {
                int indDel = scan.nextInt();
                list.remove(indDel);
                /*if (indDel == 0) {
                    list.remove(indDel);
                } else
                    list.remove(indDel - 1);*/
            }
        }
        scan.close();

        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + " ");
        }
    }
}
