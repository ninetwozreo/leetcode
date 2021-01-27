package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution560 {
	public static void main(String[] args) {
        Solution560 solution560 = new Solution560();
        int [] A={1,2,2,1,1};
        System.out.println("输出结果为："+solution560.subarraySum(A,3)); 

    }
    // 给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。

    // 示例 1 :
    
    // 输入:nums = [1,1,1], k = 2
    // 输出: 2 , [1,1] 与 [1,1] 为两种不同的情况。
    // 说明 :
    
    // 数组的长度为 [1, 20,000]。
    // 数组中元素的范围是 [-1000, 1000] ，且整数 k 的范围是 [-1e7, 1e7]。
    // 通过次数86,680提交次数193,098


































    //    public int  sumArray(int[] nums,int k){
    //        Arrays.sort(nums);
    //        int curSum=0;
    //        int res=0;
    //        for(int i=0;i<nums.length;i++){
    //            curSum+=nums[i];
    //            if(curSum==k){
    //                res++;
    //            }else if(curSum>k){
    //                curSum-=nums[i];
    //                if(curSum==k){
    //                 res++;
    //             }
    //            }
    //        }

    //     return res;
    //     }

  
    
        public int subarraySum(int[] nums, int k) {
            int count = 0;
            for (int start = 0; start < nums.length; ++start) {
                int sum = 0;
                for (int end = start; end >= 0; --end) {
                    sum += nums[end];
                    if (sum == k) {
                        count++;
                    }
                }
            }
            return count;
        }
    
}