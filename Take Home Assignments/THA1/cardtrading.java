import java.util.*;

class cardtradng {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();

        Hashtable<Integer, Integer> hashes = new Hashtable<>();

        long totalTime = 0;

        Comparator<Price> comPrice = (x, y) -> {
            if (x.total - y.total > 0) return 1;
            if (x.total - y.total < 0) return -1;
            if (x.totalBuy > y.totalBuy) return 1;
            if (x.totalBuy < y.totalBuy) return -1;
            return 0;
        };

        String secondLine = sc.nextLine();
        String[] arraySecondLine = secondLine.split(" ");

        ArrayList<Integer> deck = new ArrayList<Integer>();
        ArrayList<Price> finalPrices = new ArrayList<Price>();

        for (int p = 0; p < T; p++) {
            hashes.put(p + 1, 0);
        }

        for (int i = 0; i < N; i++ ) {
            int int1 = Integer.parseInt(arraySecondLine[i]);
            deck.add(int1);
            hashes.put(int1, hashes.get(int1) + 1);
        }

        for (int j = 0; j < T; j++) {
            long toBuy = sc.nextLong();
            long toSell = sc.nextLong();
            int frequency = hashes.get(j + 1);
            long totalBuy = (2 - frequency) * toBuy;
            long totalSell = frequency * toSell;
            finalPrices.add(new Price(totalBuy, totalSell, totalBuy + totalSell));
        }

        finalPrices.sort(comPrice);

        for (int a = 0; a < finalPrices.size(); a++) {
            if (a < K) {
                totalTime -= finalPrices.get(a).totalBuy;
            } else {
                totalTime += finalPrices.get(a).totalSell;
            }
        }
        System.out.println(totalTime);
    }


    static class Price {
        long totalBuy;
        long totalSell;
        long total;

        Price(long buy, long sell, long total) {
            this.totalBuy = buy;
            this.totalSell = sell;
            this.total = total;
        }

    }
}
