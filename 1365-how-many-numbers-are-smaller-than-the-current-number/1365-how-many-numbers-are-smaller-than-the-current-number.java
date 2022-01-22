class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] freq = new int[101];
        int[] count = new int[nums.length];
        for(int a : nums)
            freq[a]++;
        for(int i = 1 ; i < freq.length ; i++){
            freq[i] += freq[i-1];
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]==0)continue;
            count[i]=freq[nums[i]-1];
        }
        return count;
	}
}