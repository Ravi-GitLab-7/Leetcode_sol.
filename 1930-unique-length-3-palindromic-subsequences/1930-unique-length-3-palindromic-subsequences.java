class Solution {
    public int countPalindromicSubsequence(String s) {
        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> lastMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!firstMap.containsKey(ch))
                firstMap.put(ch, i);
            lastMap.put(ch, i);
        }
        int count = 0;
        for (char ch : firstMap.keySet()) {
            int firstIdx = firstMap.get(ch);
            int lastIdx = lastMap.get(ch);
            Set<Character> set = new HashSet<>();
            for (int i = firstIdx + 1; i < lastIdx; i++) {
                set.add(s.charAt(i));
            }
            count += set.size();
        }
        return count;
    }
}