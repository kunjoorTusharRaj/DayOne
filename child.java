public class child {
    public static void main(String[] args) {
        Solution s = new Solution();
        int g[] = {1,2};
        int S[] = {1,2,3};
        System.out.println("count "+s.findContentChildren(g, S));
    }
}

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < g.length; j++) {
                if (s[i] >= g[j] ) {
                    count++;
                    s[i] = 90210;
                    g[j] = 90210;
                    break;
                }
            }
        }
        return count;
    }
}