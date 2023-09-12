import java.util.Scanner; 

class autori {
    public static void main (String[] args) {
        StringBuilder result = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        
        String input = sc.next();
        sc.close();
        
        char[] chars = input.toCharArray();
        
        for (char c: chars) {
            if (c != '-') {
                if (Character.isUpperCase(c)) {
                    result.append(c);
                } 
            }
        }
        
        System.out.println(result.toString());
        
        
    }
    
}
