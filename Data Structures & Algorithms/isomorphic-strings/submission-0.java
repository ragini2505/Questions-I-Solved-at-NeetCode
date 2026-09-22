class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Charac<ter, Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(map.contains(a)){
                if(map.get(a) != b){
                    return false;
                }
            }
            else{
                if(map.containsValue(b)){
                    return false;
                }
            }
            map.put(a,b);
        }
        return true;
    }
}