package Practice;


import java.util.HashSet;

public class PairSum {

    public static void main(String[] args) {

        int[] prices = {2, 7, 4, 6};

        int target = 10;

        HashSet<Integer> seen = new HashSet<>();

        for (int x : prices) {

            if (seen.contains(target - x)) {

                System.out.println("Pair: " + (target - x) + ", " + x);
                break;
            }

            seen.add(x);
        }
    }
}
