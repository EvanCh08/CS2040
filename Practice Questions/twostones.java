import java.util.Scanner;

class twostones {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        
        int result = number % 2;
        
        if (result == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}
