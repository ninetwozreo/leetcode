// 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

// 示例 1：

// 输入: "babad"
// 输出: "bab"
// 注意: "aba" 也是一个有效答案。
// 示例 2：

// 输入: "cbbd"
// 输出: "bb"

// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution62 {
	public static void main(String[] args) {
        Solution62 solution62 = new Solution62();
        int [] A={1,2,3};
        System.out.println("输出结果为："+solution62.longestPalindrome("babad")); 
    }

    Map<String,Integer> pa= new HashMap();
    public int uniquePaths(int m, int n) {
        //思路 
        //递归进行操作
        //定义递归为下一步的路径树
        if(m==1||n==1){
            return 1;
        }

if(m<n){
    int t=m;
    m=n;
    n=t;
}

Integer tap1=pa.get(String.valueOf(m-1)+","+n);
Integer tap2=pa.get(String.valueOf(m)+","+(n-1));
if(tap1==null){
        tap1=this.uniquePaths(m-1,n);
        pa.put(String.valueOf(m-1)+","+n,tap1);
        pa.put(String.valueOf(n)+","+(m-1),tap1);
        }
        if(tap2==null){

        tap2=this.uniquePaths(m,n-1);
        pa.put(String.valueOf(n-1)+","+n,tap2);
        pa.put(String.valueOf(m)+","+(n-1),tap2);
        }

        
        
        return tap1+tap2;
      }
}