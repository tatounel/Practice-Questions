//Called TwoSum on LeetCode
//Return indices of elements in array that add up to target
//Runtime O(n^2)

class leetcode1 {
	public static void main(String[]args) {
		int[]nums = {2, 7, 11, 15};
		int target = 9;
		twoSum(nums, target);
	}
	
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[4];
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length; j++){
                if((nums[i]+nums[j]) == target) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        System.out.println(indices[0]);
        System.out.println(indices[1]);
        return indices;
    }
}
