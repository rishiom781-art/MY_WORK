class Solution {
    public int[] plusOne(int[] digit) {
        for(int i=digit.length-1;i>=0;i--)
        {
            if(digit[i]<9)
            {
                digit[i]++;
                return digit;
            }
            digit[i]=0;
        }
        int ans[]=new int[digit.length+1];
        ans[0]=1;
        return ans;
    }
}