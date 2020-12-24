package tree;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution124 {
    public static void main(String[] args) {
        Solution124 solution124 = new Solution124();
        int[] A = { 1, 2, 5, 7, 8, 3 };
        int RES = 3;
        System.out.println(RES);
        // System.out.println("输出结果为："+solution124.searchRange("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));

        
    }

    // 124. 二叉树中的最大路径和
    // 给定一个非空二叉树，返回其最大路径和。

    // 本题中，路径被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。

    // 示例 1：

    // 输入：[1,2,3]

    // 1
    // / \
    // 2 3

    // 输出：6
    // 示例 2：

    // 输入：[-10,9,20,null,null,15,7]

    // -10
    // / \
    // 9 20
    // / \
    // 15 7

    // 输出：42
    // 通过次数88,465提交次数204,795
    /**
     * Definition for a binary tree node. public class TreeNode { int val; TreeNode
     * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
     * = left; this.right = right; } }
     */
    int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int max = 0;
        TreeNode root0=new TreeNode(root);
        diguih(root);
        // Max(root);

        diguix(root0);
        return res;
    }

    public void diguix(TreeNode root) {
       
        if(root!=null&&root.val>res){
            res=root.val;
        }
        
        if (root.right != null) {
            

            diguix(root.right);
            root.val+=root.right.val;
            res=root.val>res?root.val:res;
        }
        if (root.left != null) {
            
            diguix(root.left);
            root.val+=root.left.val;
            res=root.val>res?root.val:res;

        }
      

        
    }
    public void diguih(TreeNode root) {
        if(root!=null&&root.val>res){
            res=root.val;
        }
        
        if (root.right != null) {
            

            diguih(root.right);
            root.val+=root.right.val;
            res=root.val>res?root.val:res;
        }
        if (root.left != null) {
            
            diguih(root.left);
            root.val+=root.left.val;
            res=root.val>res?root.val:res;

        }
      

        
    }
    public void  Max(TreeNode root) {

        if(root==null){
            return ;
        }
       if(root.val>res){
        res=root.val;
       }
       Max(root.left);
       Max(root.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(TreeNode another) {
            this.left = another.left;
            this.val = another.val;
            this.right = another.right;
        }
        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}