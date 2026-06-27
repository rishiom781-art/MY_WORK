
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                // First aur last element hamesha 1
                if (j == 0 || j == i) {
                    row.add(1);
                }
                // Beech ke elements
                else {
                    int val = ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j);
                    row.add(val);
                }
            }

            ans.add(row);
        }

        return ans;
    }
}