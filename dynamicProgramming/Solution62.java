
package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution62 {
//   一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。

// 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。

// 问总共有多少条不同的路径？

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