import java.util.Scanner;
import java.util.ArrayList;

class apaxiaaans {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        String name = sc.next();
        char[] array = name.toCharArray();
        ArrayList<Character> al = new ArrayList<Character>();
        
        for (int j = 0; j < array.length; j++) {
            if (j != array.length - 1) {
                if (array[j] != array[j + 1]) {
                    al.remove(array[j]);
                }

            }

            if (!al.contains(array[j])) {
                al.add(array[j]);
                sb.append(array[j]);
            }
        }
        
        System.out.println(sb.toString());
        
    }
}
