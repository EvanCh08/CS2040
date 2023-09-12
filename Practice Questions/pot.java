import java.util.Scanner;
import java.lang.Math;

class pot {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        
        int number = sc.nextInt();
        
        for (int i = 0; i < number; i++) {
            int numb = sc.nextInt();
            int out = numb / 10;
            int power = numb % 10;
            
            result += Math.pow(out, power);
        }
        
        System.out.println(result);
    }
}
