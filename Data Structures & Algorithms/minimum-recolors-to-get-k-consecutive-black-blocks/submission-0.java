class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int whiteCount = 0;
        int answer = Integer.MAX_VALUE;

        for (int right = 0; right < blocks.length(); right++) {

            if (blocks.charAt(right) == 'W') {
                whiteCount++;
            }

            if (right - left + 1 > k) {
                if (blocks.charAt(left) == 'W') {
                    whiteCount--;
                }
                left++;
            }

            if (right - left + 1 == k) {
                answer = Math.min(answer, whiteCount);
            }
        }  // closes for loop

        return answer;
    }
}
