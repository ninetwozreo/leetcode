package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution37 {
    public static void main(String[] args) {
        char[][] boraf={{'1'}};
        Solution37 a= new Solution37();
        a.solveSudoku(boraf);
        System.out.println("aaa"
        );
     }
        public void solveSudoku(char[][] board) {
            
            backtrack(board,0,0);
        }
    
       boolean isValid(char[][] board, int r, int c, char n) {
        for (int i = 0; i < 9; i++) {
            // 判断行是否存在重复
            if (board[r][i] == n) return false;
            // 判断列是否存在重复
            if (board[i][c] == n) return false;
            // 判断 3 x 3 方框是否存在重复
            if (board[(r/3)*3 + i/3][(c/3)*3 + i%3] == n)
                return false;
        }
        return true;
            }
    
    
    
        boolean backtrack(char[][] board,int row,int col){
            if(col== 9){//注意 9是溢出的
              return  backtrack(board,row+1,0);
            }
            if (row == 9) {
            // 找到一个可行解，触发 base case
                return true;
            }
            
    
    
            for(int r=row;r<9;r++){
                for(int c=col;c<9;c++){
    
                    if (board[r][c] != '.') {
                    // 如果有预设数字，不用我们穷举
                    return backtrack(board, r, c + 1);
                    } 
                    for(char ch='1';ch<='9';ch++){
                        if (!isValid(board, r, c, ch)){
                            continue;
                        }
                        board[r][c]=ch;
                       if(backtrack(board,r,c+1)){
                          return true;
                       }
                        board[r][c]='.';
                    }
                    return false;
    
                }
            }
            return false;
        }
}