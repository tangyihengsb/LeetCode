//52ms
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map=new HashMap<>();
        char[] chars=s.toCharArray();
        for(char c: chars) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(int i=0; i<chars.length; i++) {
            if(map.get(chars[i]) == 1) return i;
        }
        return -1;  //not exist
    }
}
