import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

class bestrelayteam {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbOfRunners = sc.nextInt();
        sc.nextLine();
        ArrayList<Runner> firstTimes = new ArrayList<Runner>();
        ArrayList<Runner> otherTimes = new ArrayList<Runner>();
        StringBuilder sb = new StringBuilder();
        Comparator<Runner> fTime = (x, y) -> {
            if (x.a - y.a > 0) {
                return 1;
            } else if (x.a - y.a < 0) {
                return -1;
            }
            return 0;
        };
        Comparator<Runner> oTime = (x, y) -> {
            if (x.b - y.b > 0) {
                return 1;
            } else if (x.b - y.b < 0) {
                return -1;
            }
            return 0;
        };


        double totalTime = Double.MAX_VALUE;

        for (int i = 0; i < numbOfRunners; i++) {
            String name = sc.nextLine();
            String[] strings = name.split(" ");
            Runner r = new Runner(strings[0], Double.parseDouble(strings[1]), Double.parseDouble(strings[2]));
            firstTimes.add(r);
            otherTimes.add(r);
        }

        firstTimes.sort(fTime);
        otherTimes.sort(oTime);

        List<Runner> listFirstTimes = firstTimes.subList(0, 4);
        List<Runner> listOtherTimes = otherTimes.subList(0, 4);

        int index = 0;
        List<Runner> arr1 = new ArrayList<Runner>();

        for (int j = 0; j < listFirstTimes.size(); j++) {
            int size = listOtherTimes.size();
            List<Runner> arr2 = new ArrayList<Runner>();
            Runner r = listFirstTimes.get(j);
            index = listOtherTimes.indexOf(r);
            if (index < 0) {
                size = listOtherTimes.size() - 1;
            }

            arr2.add(r);
            double setTime = r.a;
            for (int k = 0; k < size; k++) {
                if (k == index) {
                    continue;
                } else {
                    String name = listOtherTimes.get(k).name;
                    setTime += listOtherTimes.get(k).b;
                    arr2.add(listOtherTimes.get(k));
                }
            }

            if (setTime < totalTime) {
                totalTime = setTime;
                arr1 = new ArrayList<>(arr2);
            }
            setTime = 0.0;
        }

        sb.append(totalTime + "\n");

        for (int p = 0; p < arr1.size(); p++) {
            sb.append(arr1.get(p).name + "\n");
        }
        System.out.println(sb.toString());
    }

    static class Runner {
        String name;
        double a;
        double b;

        public Runner(String name, double a, double b) {
            this.name = name;
            this.a = a;
            this.b = b;
        }
    }
}
