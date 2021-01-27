package bfs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class Solution91 {
    // 一条包含字母 A-Z 的消息通过以下方式进行了编码：

    // 'A' -> 1
    // 'B' -> 2
    // ...
    // 'Z' -> 26
    // 给定一个只包含数字的非空字符串，请计算解码方法的总数。

    // 题目数据保证答案肯定是一个 32 位的整数。

    //  

    // 示例 1：

    // 输入：s = "12"
    // 输出：2
    // 解释：它可以解码为 "AB"（1 2）或者 "L"（12）。
    // 示例 2：

    // 输入：s = "226"
    // 输出：3
    // 解释：它可以解码为 "BZ" (2 26), "VF" (22 6), 或者 "BBF" (2 2 6) 。
    // 示例 3：

    // 输入：s = "0"
    // 输出：0
    // 示例 4：

    // 输入：s = "1"
    // 输出：1
    // 示例 5：

    // 输入：s = "2"
    // 输出：1
    //  

    // 提示：

    // 1 <= s.length <= 100
    // s 只包含数字，并且可能包含前导零

    public static void main(String[] args) {
        Solution91 solution5 = new Solution91();
        int[] A = { 1, 2, 3 };
        System.out.println("输出结果为：" + solution5.numDecodings("12"));
    }

    public int numDecodings(String s) {

        // 长度+1 存储各长度字符串解码方法总数
        Integer memo[] = new Integer[s.length() + 1];
        // 长度为0的空字符串解法设为 1
        memo[0] = 1;
        // 长度为1 的字符串解码
        if (s.charAt(s.length() - 1) == '0') {
            memo[1] = 0;
        } else { // 不是0则只能为1-9，只有一种解码方法
            memo[1] = 1;
        }
        // 算2至n解码方法总数
        for (int i = 2; i < s.length() + 1; i++) {

            // 设置1位2位数字是否可解码的标志位
            int oneNum = 1;
            int twoNum = 1;
            int firstNum = Integer.parseInt(s.substring(s.length() - i, s.length() - i + 1));
            String firstTwoNumStr = s.substring(s.length() - i, s.length() - i + 2);
            int firstTwoNum = Integer.parseInt(firstTwoNumStr);
            // 一位数字不可解码的情况
            if (firstNum > 26 || firstNum < 1)
                oneNum = 0;
            // 两位数字不可解码的情况
            if (firstTwoNumStr.charAt(0) == '0')
                twoNum = 0;
            if (firstTwoNum > 26 || firstTwoNum < 1)
                twoNum = 0;

            // 计算memo[n]，即长度为n的字符串的解法总数
            memo[i] = oneNum * memo[i - 1] + twoNum * memo[i - 2];
        }

        // 返回memo[n],即长度为n的字符串的解码方法总数
        return memo[s.length()];
    }

    // 计算memo[n]，即长度为n的字符串的解法总数
    // memo[i] = oneNum * memo[i - 1] + twoNum * memo[i - 2];

    // def dp(n):
    // # base case
    // if n == 0: return 0
    // if n < 0: return -1
    // # 求最小值，所以初始化为正无穷
    // res = float('INF')
    // for coin in coins:
    // subproblem = dp(n - coin)
    // # 子问题无解，跳过
    // if subproblem == -1: continue
    // res = min(res, 1 + subproblem)

    // return res if res != float('INF') else -1

    // return dp(amount)

    // return res;

    // }

}