class Solution {
    public int maxDifference(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault(c, 0)+1);
        }

        int largestOdd = 0; 
        int smallestEven = Integer.MAX_VALUE;

        for(char c : map.keySet()){
            int freq = map.get(c);
            if(freq % 2 == 1){
                largestOdd = Math.max(largestOdd , freq);
            }
            else{
                smallestEven = Math.min(smallestEven,freq);
            }
        }
        return largestOdd - smallestEven;
    }
}