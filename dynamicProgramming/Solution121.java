
// 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

// 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。

// 注意：你不能在买入股票前卖出股票。

// 示例 1:

// 输入: [7,1,5,3,6,4]
// 输出: 5
// 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
//      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
// 示例 2:

// 输入: [7,6,4,3,1]
// 输出: 0
// 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
// 通过次数338,499提交次数610,553
package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution121 {
  public static void main(String[] args) {
    Solution121 solution121 = new Solution121();
    int[] A = {7,1,5,3,6,4};
    System.out.println("输出结果为：" + solution121.maxProfit(A));
  }

  public int maxProfit(int[] prices) {
    int res = 0;
    
    for (int j = 0; j < prices.length; j++) {
      int bf = prices[j];
      for (int i = j; i < prices.length; i++) {
        int cure = prices[i] - bf;
        if (cure > res) {
          res = cure;
        }
      }
    }
    return res;
  }

}