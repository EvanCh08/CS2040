import java.util.Scanner;

class numberfun {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        
        String result = "";
        
        for (int i = 0; i < number; i++) {
            double num1 = (double) sc.nextInt();
            double num2 = (double) sc.nextInt();
            double num3 = (double) sc.nextInt();
            
            if (calculate(num1, num2, num3)) {
                result += "Possible" + "\n";
            } else {
                result += "Impossible" + "\n";
            }
        }
        
        System.out.println(result);
        
        
    }
    
    public static boolean calculate(double n1, double n2, double n3) {
        if (n1 + n2 == n3) {
            return true;
        } else if ((n1 - n2) == n3 || (n2 - n1) == n3) {
            return true;
        } else if (n1 * n2 == n3) {
            return true;
        } else if ((n1 / n2) == n3 || (n2 / n1) == n3) {
            return true;
        } else {
            return false;
        }
    }
}
