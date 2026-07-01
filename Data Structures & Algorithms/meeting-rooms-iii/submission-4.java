class Solution {
    public int mostBooked(int n, int[][] meetings) {

        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> free = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            free.add(i);
        }

        PriorityQueue<long[]> busy = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] == b[0]) return Long.compare(a[1], b[1]);
                return Long.compare(a[0], b[0]);
            }
        );

        int[] count = new int[n];

        for (int[] m : meetings) {

            long start = m[0];
            long end = m[1];
            long duration = end - start;

            // free all rooms that are available by start time
            while (!busy.isEmpty() && busy.peek()[0] <= start) {
                free.add((int) busy.poll()[1]);
            }

            if (!free.isEmpty()) {

                int room = free.poll();
                busy.add(new long[]{end, room});
                count[room]++;

            } else {

                long[] cur = busy.poll();
                long newStart = cur[0];
                long newEnd = newStart + duration;

                count[(int) cur[1]]++;
                busy.add(new long[]{newEnd, cur[1]});
            }
        }

        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (count[i] > count[ans]) {
                ans = i;
            }
        }

        return ans;
    }
}