
// 给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？

// 示例:

// 输入: 3
// 输出: 5
// 解释:
// 给定 n = 3, 一共有 5 种不同结构的二叉搜索树:

//    1         3     3      2      1
//     \       /     /      / \      \
//      3     2     1      1   3      2
//     /     /       \                 \
//    2     1         2                 3
package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution96 {
	public static void main(String[] args) {
        Solution96 solution96 = new Solution96();
        int [] A={1,2,3};
        //以较低水平通过
        System.out.println(solution96.numTrees(5)); 
    }

    Map<String,Integer> dp= new HashMap();

    public int numTrees(int n) {
       return tranverse(1,n);
    }
    int tranverse(int lt,int rt){
        if(lt>=rt){
            return 1;
        }
        int res=0;
        for(int i=lt;i<=rt;i++){
            String key= String.valueOf(lt)+i+rt;
            if(dp.get(key)==null){
                dp.put(key, tranverse(lt, i-1)*tranverse(i+1, rt));
            }
           int ires=dp.get(key);
           res= res+ires;
        }
        return res;
    }

  
}