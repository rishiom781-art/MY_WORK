import java.util.*;
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            long cur = nums[i];
            while (!st.isEmpty() && st.peek() == cur) {
                st.pop();
                cur *= 2;
            }
            st.push(cur);
        }
        return new ArrayList<>(st);
    }
}