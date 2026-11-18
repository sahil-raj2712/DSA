class Solution {
    public int minChanges(String s) {
        int count = 0 ;
        for(int i=1;i< s.length();i=i+2){
            if(i % 2 != 0 && s.charAt(i)!=s.charAt(i-1)){
                count++;
            }
            else{
                continue;
            }
        }
        return count;
    }
}