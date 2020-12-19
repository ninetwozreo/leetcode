package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution48 {
	public static void main(String[] args) {
        Solution48 solution48 = new Solution48();
        int [][] A={{1,2,3},{4,5,6},{7,8,9}};
        solution48.rotate(A);
        // solution121.largestPerimeter(A);
        System.out.println(A.toString());
        // System.out.println("输出结果为："+Solution48.searchRange("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth")); 

    }
    // 给定一个 n × n 的二维矩阵表示一个图像。

    // 将图像顺时针旋转 90 度。
    
    // 说明：
    
    // 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
    

        public void rotate(int[][] matrix) {
            int le=matrix.length;
            int ce=0;
            if(le%2==0){
                ce=le/2;
            }else{
                ce=le/2+1;

            }
            for(int i=0;i<le;i++){
                for(int j=i;j<le;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
            for(int i=0;i<le;i++){
                for(int j=0;j<ce;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[i][le-j-1];
                    matrix[i][le-j-1]=temp;
                }
            }
    
        }
    
   

}