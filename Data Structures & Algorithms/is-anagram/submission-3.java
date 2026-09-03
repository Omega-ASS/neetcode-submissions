class Solution {
    public boolean isAnagram(String s, String t) {
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);

        if (s.length() != t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++){
            if (string1[i] != string2[i]){
                return false;
            }
        }
        return true;

    }
}
