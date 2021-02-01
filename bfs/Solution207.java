package bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

class Solution207 {

    // 你这个学期必须选修 numCourse 门课程，记为 0 到 numCourse-1 。

    // 在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们：[0,1]

    // 给定课程总量以及它们的先决条件，请你判断是否可能完成所有课程的学习？

    // 示例 1:

    // 输入: 2, [[1,0]]
    // 输出: true
    // 解释: 总共有 2 门课程。学习课程 1 之前，你需要完成课程 0。所以这是可能的。
    // 示例 2:

    // 输入: 2, [[1,0],[0,1]]
    // 输出: false
    // 解释: 总共有 2 门课程。学习课程 1 之前，你需要先完成​课程 0；并且学习课程 0 之前，你还应先完成课程 1。这是不可能的。

    // 提示：

    // 输入的先决条件是由 边缘列表 表示的图形，而不是 邻接矩阵 。详情请参见图的表示法。
    // 你可以假定输入的先决条件中没有重复的边。
    // 1 <= numCourses <= 10^5

    public static void main(String[] args) {
        Solution207 solution207 = new Solution207();
        int[][] A = { { 0, 2 }, { 1, 2 }, { 2, 0 } };
        System.out.println("输出结果为：" + solution207.canFinish(5, A));
    }

    Map<Integer, int[]> map = new HashMap();
    Map<Integer, Boolean> bmap = new HashMap();

    // 广度优先算法实现
    public boolean canFinishO(int numCourses, int[][] prerequisites) {
        Queue<Integer> queue = new LinkedList<>();
        // add to map
        for (int i = 0; i < prerequisites.length; i++) {
            int[] curData = prerequisites[i];
            int lastNum = curData[curData.length - 1];
            if (map.containsKey(lastNum)) {
                int[] a = new int[map.get(lastNum).length + curData.length - 1];
                for (int n = 0; n < curData.length - 1; n++) {
                    a[n] = curData[n];
                }
                for (int n = curData.length - 1; n < a.length; n++) {
                    a[n] = map.get(lastNum)[n - curData.length + 1];
                }
                map.put(lastNum, a);

            } else {

                map.put(lastNum, curData);
            }
            bmap.put(curData[curData.length - 1], false);
        }

        for(int i=0;i<numCourses;i++){
            if(map.get(i)==null){
                queue.add(i);
            }
        }

        
        return false;

    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer> steps = new ArrayList();
        for (int i = 0; i < prerequisites.length; i++) {
            int[] curData = prerequisites[i];
            int lastNum = curData[curData.length - 1];
            if (map.containsKey(lastNum)) {
                int[] a = new int[map.get(lastNum).length + curData.length - 1];
                for (int n = 0; n < curData.length - 1; n++) {
                    a[n] = curData[n];
                }
                for (int n = curData.length - 1; n < a.length; n++) {
                    a[n] = map.get(lastNum)[n - curData.length + 1];
                }
                map.put(lastNum, a);

            } else {

                map.put(lastNum, curData);
            }
            bmap.put(curData[curData.length - 1], false);
        }

        for (int j = 0; j < prerequisites.length; j++) {
            // boolean res=getWheather(prerequisites[j][prerequisites[j].length-1]);
            // if(!res){
            // return res;
            // }
            steps.clear();
            for (int m = prerequisites[j].length - 1; m >= 0; m--) {
                int curNum = prerequisites[j][m];
                if (getWheather(curNum, steps)) {
                    continue;
                } else {
                    return false;
                }
                // if(steps.contains(prerequisites[j][m])){
                // return false;
                // }else{
                // steps.add(prerequisites[j][m]);
                // }
            }
        }
        return true;
    }

    boolean getWheather(int curNum, List<Integer> steps) {
        int[] curData = map.get(curNum);
        // if(bmap.get(curNum)){
        // return false;
        // }else{
        // bmap.replace(curNum, true);
        // }

        if (curData == null) {
            return true;
        }
        for (int i = curData.length - 2; i >= 0; i--) {
            if (steps.contains(curData[i])) {
                return false;
            }
            steps.add(curData[i]);
            boolean res = getWheather(curData[i], steps);
            steps.clear();
            if (!res) {
                return res;
            }
        }
        return true;

    }
}
