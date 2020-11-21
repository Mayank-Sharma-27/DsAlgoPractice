package questions.custom.sort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

public class CustomSortString {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Pair {
        String string;
        int priority;
    }


    public String customSortString(String S, String T) {
        int n = S.length();
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((n1, n2) -> n1.priority - n2.priority);
        List<String> notPresentStrings = new ArrayList<>();
        for (int i = 0; i < T.length(); i++) {
            if (!S.contains(T.substring(i, i + 1))) {
                notPresentStrings.add(T.substring(i, i + 1));
            }
        }

        for (int i = 0; i < n; i++) {
            Pair pair = new Pair(S.substring(i, i + 1), i + 1);
            pq.add(pair);
        }

        StringBuilder sb = new StringBuilder();
        for (String s : notPresentStrings) {
            sb.append(s);
        }

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < T.length(); i++) {
            if (map.get(T.substring(i, i + 1)) == null) {
                map.put(T.substring(i, i + 1), 1);
            } else {
                int value = map.get(T.substring(i, i + 1));
                value++;
                map.put(T.substring(i, i + 1), value);
            }
        }

        while (!pq.isEmpty()) {
            Pair pair = pq.poll();
            if (T.contains(pair.string)) {
                int value = map.get(pair.string);
                for (int i = 0; i < value; i++) {
                    sb.append(pair.string);
                }
            }

        }
        return sb.toString();
    }

}
