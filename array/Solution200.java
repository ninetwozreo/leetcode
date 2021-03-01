package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution200 {
	public static void main(String[] args) {
        Solution200 solution200 = new Solution200();
        char [][] A={{'1','1','1'},{'0','1','0'},{'1','1','1'}};
        // char [][] A={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        // solution121.largestPerimeter(A);
        System.out.println("输出结果为："+solution200.numIslands(A)); 

    }
  
// 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。

// 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。

// 此外，你可以假设该网格的四条边均被水包围。

 
        public int numIslands(char[][] grid) {
            List<String> the= new ArrayList<>();
            int res=0;




            for(int h=0;h<grid.length;h++){
                for(int l=0;l<grid[0].length;l++){
                    if(grid[h][l]=='1'){
                        Map<Integer,Integer> curMap= new HashMap<>();
                        infect(grid, h, l);
                        res++;

                    }
                }
            }

  
            return res;
    
        }
//感染函数 图的递归皆可用

        public void infect(char[][] grid, int i, int j){
            if(i < 0 || i >= grid.length ||
               j < 0 || j >= grid[0].length || grid[i][j] != '1'){
                return;
            }
            grid[i][j] = '2';
            infect(grid, i + 1, j);
            infect(grid, i - 1, j);
            infect(grid, i, j + 1);
            infect(grid, i, j - 1);
        }
        // void infect(char[][] grid, int i, int j) {
        //     if (i + 1 < grid.length)
        //         grid[i + 1][j] = '2';
        //     if (j + 1 < grid[0].length)
        //         grid[i][j + 1] = '2';
        //     if (i - 1 >= 0) {
        //         grid[i - 1][j] = '2';

        //     }
        //     if (j - 1 >= 0) {
        //         grid[i][j - 1] = '2';

        //     }
            
        // }
   

}