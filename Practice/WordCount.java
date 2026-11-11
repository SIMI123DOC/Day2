package Practice;
import java.util.HashMap;

public class WordCount {

    public static void main(String[] args) {

        String[] words = {"good", "clear", "good", "fast", "clear", "good"};

        HashMap<String, Integer> counts = new HashMap<>();

        for (String w : words) {

            if (counts.containsKey(w)) {
                counts.put(w, counts.get(w) + 1);
            }
            else {
                counts.put(w, 1);
            }
        }

        System.out.println(counts);
    }
}
