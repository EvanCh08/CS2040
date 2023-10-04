import java.io.*;
import java.util.*;

class joinstrings {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        ArrayList<Node> arrays = new ArrayList<Node>();
        ArrayList<Node> arrays2 = new ArrayList<Node>();
        Node[] main = new Node[number];
        Node[] main2 = new Node[number];
        int finalIndex = 0;

        if (number == 1) {
            pw.print(br.readLine());

        } else {
            for (int i = 0; i < number; i++) {
                String string = br.readLine();

                main[i] = new Node(string, null, null, false);
                main2[i] = new Node(string, null, null, false);
            }

            for (int j = 0; j < number - 1; j++) {
                String s = br.readLine();
                String[] parses = s.split(" ");
                int a = (Integer.parseInt(parses[0]) - 1);
                int b = (Integer.parseInt(parses[1]) - 1);
                if (main[a].isInserted && main[b].isInserted) {
                    main[a].last.next = main[b];
                    main[a].last = main[b].last;
                } else if (main[a].isInserted) {
                    main[a].last.next = main2[b];
                    main[a].last = main2[b];

                } else if (main[b].isInserted) {
                    main[a].last = main[b].last;
                    main[a].next = main[b];
                    main[a].isInserted = true;

                } else {
                    main[a].next = main2[b];
                    main[a].last = main2[b];
                    main[a].isInserted = true;

                }

                finalIndex = a;
            }

            Node k = main[finalIndex];

            for (Node u = k; u != null; u = u.next) {
                pw.print(u.value);
            }
        }


        pw.flush();
        pw.close();
    }

    static class Node {
        String value;
        Node next;
        Node last;
        boolean isInserted;

        public Node (String value, Node next, Node last, boolean isInserted) {
            this.value = value;
            this.next = next;
            this.last = last;
            this.isInserted = isInserted;
        }
    }
}
