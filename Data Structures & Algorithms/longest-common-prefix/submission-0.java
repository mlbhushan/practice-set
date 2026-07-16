class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null){
            return "";
        }

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        StringBuilder result = new StringBuilder();

        int length = Math.min(first.length(), last.length());

        for(int i = 0; i < length; i ++){
            if(first.charAt(i) == last.charAt(i)){
                result.append(first.charAt(i));
            } else{
                break;
            }
        }

        return result.toString();

    }
}