class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] characters = word.toCharArray();

            Arrays.sort(characters);

            String sortedwd = new String(characters);

            if(!map.containsKey(sortedwd)){
                map.put(sortedwd, new ArrayList<>());
            }

            map.get(sortedwd).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
