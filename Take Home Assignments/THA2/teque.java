import java.util.*;
import java.io.*;


class teque {
     public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        TQ t = new TQ();

        for (int i = 0; i < number; i++) {
            String input = br.readLine();
            String[] parsing = input.split(" ");

            String command = parsing[0];
            int numberParse = Integer.parseInt(parsing[1]);

            if (command.equals("push_back")) {
                t.pushBack(numberParse);
            } else if (command.equals("push_front")) {
               t.pushFront(numberParse);

            } else if (command.equals("push_middle")) {
                t.pushMiddle(numberParse);
            } else {
                if (numberParse >= t.frontSize) {
                    int index = numberParse - t.frontSize;
                    int al = t.headBack - index;
                    pw.println(t.back[t.headBack - index]);
                } else {
                    int index = t.headFront;
                    int al = t.headFront + 1 + numberParse;
                    pw.println(t.front[t.headFront + 1 + numberParse]);
                }
            }
        }


        pw.flush();
        pw.close();
    }




    static class TQ {

        static int[] front = new int[(int) Math.pow(10, 6)];
        static int[] back = new int[(int) Math.pow(10, 6)];
        static int headFront = ((front.length + 1) / 2) - 1;
        static int tailFront =  ((front.length + 1) / 2) - 1;
        static int headBack = ((back.length + 1) / 2) - 1;
        static int tailBack = ((back.length + 1) / 2) - 1;
        static int frontSize = 0;
        static int backSize = 0;

        public void pushFront(int value) {

            front[headFront] = value;
            headFront--;
            frontSize++;
            adjustSize();
        }

        public void pushBack(int value) {

            if (frontSize == 0) {
                pushFront(value);
            } else {
                back[tailBack] = value;
                tailBack--;
                backSize++;
            }
            adjustSize();

        }

        static void adjustSize() {
            if (frontSize > backSize + 1) {
                int value = front[tailFront];
                back[headBack + 1] = value;
                front[tailFront] = 0;
                headBack++;
                tailFront--;
                backSize++;
                frontSize--;
            } else if (backSize > frontSize) {
                int value = back[headBack];
                front[tailFront + 1] = value;
                back[headBack] = 0;
                headBack--;
                tailFront++;
                frontSize++;
                backSize--;
            }
        }

        public void pushMiddle(int value) {

            if (frontSize == backSize) {
                front[tailFront + 1] = value;
                tailFront++;
                frontSize++;
            } else if (frontSize > backSize) {
                back[headBack + 1] = value;
                headBack++;
                backSize++;
            } else {
                front[tailFront + 1] = value;
                tailFront++;
                frontSize++;
            }

            adjustSize();
        }

    }
}
