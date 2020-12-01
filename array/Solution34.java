package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution34 {
	public static void main(String[] args) {
        Solution34 solution34 = new Solution34();
        int [] A={1,2,3};
        // solution121.largestPerimeter(A);
    }
    //34
    // 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。

    // 如果数组中不存在目标值 target，返回 [-1, -1]。

    // 进阶：

    // 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？

    public int[] searchRange(int[] nums, int target) {
        int [] res ={-1,-1};
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==target){
                if(res[0]==-1){
                    res[0]=i;
                    res[1]=i;
                }else{
                    res[1]=i;
                }
            }else{
                if(res[1]!=-1){
                    break;
                }
            }
        }
        return res ;
    }
   

}