import java.util.Scanner;

class detaileddifferences {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        String result = "";
        
        for (int i = 0; i < number; i++) {
            String a = sc.next();
            String b = sc.next();
            
            result += a + "\n" + b + "\n";
            
            char[] charA = a.toCharArray();
            char[] charB = b.toCharArray();
            
            for (int k = 0; k < charA.length; k++) {
                if (charA[k] == charB[k]) {
                    result += ".";
                } else {
                    result += "*";
                }
            }

            if (i != number - 1) {
                result += "\n" + "\n";
            } 
        }

        System.out.println(result);
    }
}
