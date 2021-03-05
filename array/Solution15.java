package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution15 {
	public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        int [] A={0,0,0,0};
        // solution121.largestPerimeter(A);
        System.out.println("输出结果为："+solution15.threeSums(A)); 

    }
    // 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。

    // 注意：答案中不可以包含重复的三元组。
    
    //  
    
    // 示例 1：
    
    // 输入：nums = [-1,0,1,2,-1,-4]
    // 输出：[[-1,-1,2],[-1,0,1]]
    // 示例 2：
    
    // 输入：nums = []
    // 输出：[]
    // 示例 3：
    
    // 输入：nums = [0]
    // 输出：[]
    //  
    public List<List<Integer>> threeSum(int[] nums) {
        // for()
        List<List<Integer>> res= new ArrayList<>();
        List<String> cList= new ArrayList<>();
        int t1=0,t2=1,t3=2;
      

        if(nums == null || nums.length < 3) return res;

        Arrays.sort(nums);

        int flag=0;
        while(t1<nums.length){
            while(t2<nums.length){
                
                while(t3<nums.length){
                    
                    if(nums[t1]+nums[t2]+nums[t3]==0){
                       if(nums[t1]==nums[t2]){
                           t3++;
                           if(flag==0){
                            res.add(new ArrayList<Integer>(Arrays.asList(nums[t1],nums[t2],nums[t3])));
                           }
                           flag++;

                           continue;
                       }
                        res.add(new ArrayList<Integer>(Arrays.asList(nums[t1],nums[t2],nums[t3])));
                    }
                    t3++;
                }
                t2++;
                t3=t2+1;
            }
            
            t1++;
            t2=t1+1;
        }

        return res;
    }
    // public List<List<Integer>> threeSum(int[] nums) {
    //     List<List<Integer>> result = new LinkedList<>();
    //     // sort
    //     Arrays.sort(nums);
    //     // 3 foreach
    //     int n = nums.length;
    //     for (int i = 0; i < n; i++) {
    //         if (i > 0 && nums[i] == nums[i - 1]) continue;
    //         int t = -nums[i];
    //         int j = i + 1, k = n - 1;
    //         while (j < k) {
    //             if (nums[j] + nums[k] > t) {
    //                 k--;
    //             } else if (nums[j] + nums[k] < t) {
    //                 j++;
    //             } else {
    //                 // find
    //                 List<Integer> ans = new LinkedList<>();
    //                 ans.add(nums[i]);
    //                 ans.add(nums[j]);
    //                 ans.add(nums[k]);
    //                 result.add(ans);
    //                 // 去除临近相同的元素
    //                 while (j < k && nums[j] == nums[j + 1]) j++;
    //                 while (j < k && nums[k] == nums[k - 1]) k--;
    //                 j++;
    //                 k--;
    //             }
    //         }
    //     }
    //     return result;
    // }

// 作者：jyd
// 链接：https://leetcode-cn.com/problems/3sum/solution/3sumpai-xu-shuang-zhi-zhen-yi-dong-by-jyd/
// 来源：力扣（LeetCode）
// 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

}