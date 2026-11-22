class Solution {
    public boolean checkString(String s) {
        int count =0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        for (int i = count; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                return false;
            }
        }

        return true;
    }
}