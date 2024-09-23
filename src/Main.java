public class solution {
    public int [] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findlast(nums, target);
        return result;
    }
    private int findfirst(int[]nums,int target) {
        int left = 0, right =nums.length-1;
         while (left<= right) {
             int mid = left + (right - left) / 2;
             if (nums[mid] >= target) {
                 right = mid - 1;
             } else {
                 left = mid + 1;
             }
             if (nums[mid] == target) {
                 index = mid;
             }
         }
         return index;
    private int findlast(int[]nums,int target){
        int left = -1;
        while (left <= right){
            int mid = left + (right-left)/2;
            if (nums [mid] <= target) {
                left = mid + 1;
            } else {
                right = mid -1;
                if (nums[mid] == target){
                    index = mid;
                }
            }
            return index;
        }

        }
    // search range (int[] nums , int target ,is the main method that calls two helper functions. find first and find last
    //find  first , it performs  a binary search to find the first occurance of the target
    // find last it finds the last occurance of the target
