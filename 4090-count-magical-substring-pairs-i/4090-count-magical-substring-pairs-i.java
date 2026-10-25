class Solution {
    public int countMagicalPairs(String s) {
        int n = s.length();
        long ans = 0;
        int[][] l = new int[n][27];
        int[][] r = new int[n][27];
        for(int j=0;j<n;j++){
            boolean[] seen = new boolean[26];
            int d =0;
            for(int i=j;i>=0;i--){
                int c =s.charAt(i)-'a';
                if(!seen[c]){
                    seen[c] = true;
                    d++;
                }
                l[j][d]++;
            }
        }
        for(int j=0;j<n;j++){
            boolean[] seen  = new boolean[26];
            int d =0;
            for(int k=j;k<n;k++){
                int c = s.charAt(k)-'a';
                if(!seen[c]){
                    seen[c] = true;
                    d++;
                }
                r[j][d]++;
            }
        }
        for(int j =0;j<n-1;j++){
            for(int dis=1;dis<=26;dis++){
                ans += (long) l[j][dis]*r[j+1][dis];
            }
        }
        return(int) ans;
    }
}