import java.util.Scanner;

class lastfactorialdigit {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        
        int number = sc.nextInt();
        
        for (int i = 0; i < number; i++) {
            int numb = sc.nextInt();
            if (i != number - 1) {
                result += (factorial(numb) % 10) + "\n";
            } else {
                result += (factorial(numb) % 10);
            }
        }
        
        System.out.println(result);
    }
    
    public static int factorial(int n) {
        int result = 1;
        
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
 }
