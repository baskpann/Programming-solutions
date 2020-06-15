class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int n = people.length, i, j;
        int[][] tmp = new int[1][2];
    
        Arrays.sort(people, (p1, p2) -> p1[0] == p2[0] ? p1[1] - p2[1] : p2[0] - p1[0]);
        List<int[]> res = new ArrayList<>();
        for(i = 0; i < n; i++)
            res.add(people[i][1], people[i]);
        return res.toArray(people);
    }
}