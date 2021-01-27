package tree;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution236 {
    public static void main(String[] args) {
        Solution236 solution236 = new Solution236();
        int[] A = { 1, 2, 5, 7, 8, 3 };
        int RES = 3;
        System.out.println(RES);
        // System.out.println("输出结果为："+solution236.searchRange("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));

        
    }
    // 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。

    // 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
    
    // 例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]
    
    
    
    //  
    
    // 示例 1:
    
    // 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
    // 输出: 3
    // 解释: 节点 5 和节点 1 的最近公共祖先是节点 3。
    // 示例 2:
    
    // 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
    // 输出: 5
    // 解释: 节点 5 和节点 4 的最近公共祖先是节点 5。因为根据定义最近公共祖先节点可以为节点本身。
    //  
    
    // 说明:
    
    // 所有节点的值都是唯一的。
    // p、q 为不同节点且均存在于给定的二叉树中。
    
    // 来源：力扣（LeetCode）
    // 链接：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree
    // 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
   
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