//import java.util.*;

class CountSquares {

    private Map<Integer, Map<Integer, Integer>> points;

    public CountSquares() {
        points = new HashMap<>();
    }

    public void add(int[] point) {
        int x = point[0];
        int y = point[1];

        points.putIfAbsent(x, new HashMap<>());
        points.get(x).put(y,
                points.get(x).getOrDefault(y, 0) + 1);
    }

    public int count(int[] point) {
        int x = point[0];
        int y = point[1];

        if (!points.containsKey(x)) {
            return 0;
        }

        int ans = 0;
        Map<Integer, Integer> yMap = points.get(x);

        for (int y1 : yMap.keySet()) {
            if (y1 == y) continue;

            int side = y1 - y;

            // Right square
            ans += yMap.get(y1)
                    * points.getOrDefault(x + side, Collections.emptyMap())
                            .getOrDefault(y, 0)
                    * points.getOrDefault(x + side, Collections.emptyMap())
                            .getOrDefault(y1, 0);

            // Left square
            ans += yMap.get(y1)
                    * points.getOrDefault(x - side, Collections.emptyMap())
                            .getOrDefault(y, 0)
                    * points.getOrDefault(x - side, Collections.emptyMap())
                            .getOrDefault(y1, 0);
        }

        return ans;
    }
}