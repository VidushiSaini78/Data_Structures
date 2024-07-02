class Merge_Intervals {
    public int[][] merge(int[][] ar) {
        Arrays.sort(ar, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) {
                    return a[0] - b[0];
                } else {
                    return a[1] - b[1];
                }
            }
        });
       List<List<Integer>> my = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            int start = ar[i][0];
            int end = ar[i][1];
            if (my.isEmpty() || my.get(my.size() - 1).get(1) < start) {
                my.add(Arrays.asList(start, end));
            } else {
                List<Integer> lastInterval = my.get(my.size() - 1);
                lastInterval.set(1, Math.max(end, lastInterval.get(1)));
            }
        }
        int ans[][] = new int[my.size()][ar[0].length];
        for(int i=0 ; i<my.size() ; i++)
        {
            ans[i][0] = my.get(i).get(0);
            ans[i][1] = my.get(i).get(1);
        }
    return ans;

    }
}
