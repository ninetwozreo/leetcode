package tree;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.lang.model.util.ElementScanner6;

class Solution450 {
    public static void main(String[] args) {
        Solution450 solution450 = new Solution450();
        int[] A = { 1, 2, 5, 7, 8, 3 };
        int RES = 3;
        System.out.println(RES);
        // System.out.println("输出结果为："+solution450.searchRange("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));

        
    }

    // 给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，并保证二叉搜索树的性质不变。
    // 返回二叉搜索树（有可能被更新）的根节点的引用。

    // 一般来说，删除节点可分为两个步骤：
    
    // 首先找到需要删除的节点；
    // 如果找到了，删除它。
    // 说明： 要求算法时间复杂度为 O(h)，h 为树的高度。
    
    // 示例:
    
    // root = [5,3,6,2,4,null,7]
    // key = 3
    
    //     5
    //    / \
    //   3   6
    //  / \   \
    // 2   4   7
    
    // 给定需要删除的节点值是 3，所以我们首先找到 3 这个节点，然后删除它。
    
    // 一个正确的答案是 [5,4,6,2,null,null,7], 如下图所示。
    
    //     5
    //    / \
    //   4   6
    //  /     \
    // 2       7
    
    // 另一个正确答案是 [5,2,6,null,4,null,7]。
    
    //     5
    //    / \
    //   2   6
    //    \   \
    //     4   7
    // 通过次数28,903提交次数63,534
    /**
     * Definition for a binary tree node. public class TreeNode { int val; TreeNode
     * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
     * = left; this.right = right; } }
   
        [5,3,6,2,4,null,7]
     * 
     * [5,3,6,2,4,null,7]
        7
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode top=root;
        if(root==null||root.val==key&&root.left==null&&root.right==null){
            return null;
        }
        tranverse(root,key);
        // tranverse(root.right,key);
        return top;
    }

    public void tranverse(TreeNode root,int key){
        if(root==null){
            return;
        }
        if(root.val==key){
            delete(root);
            return;
        }else if(root.val>key){
            tranverse(root.left, key);
        }else{
            tranverse(root.right, key);
        }
    }

    public void delete(TreeNode root){
         if(root.right!=null){
            if(root.right.left!=null){

                addValToTree(root.left,root.right.left);
            }
            root.val=root.right.val;

            root.right=root.right.right;
            

        }else if(root.left!=null){
            if(root.left.right!=null){
                addValToTree(root.right,root.left.right);
                
            }
            root.val=root.left.val;

            root.left=root.left.left;
            
            // root.right.left=root.right;
            
        }else{
            root=null;
        }

    }

    public void addValToTree(TreeNode root,TreeNode target){
        if(root==null){
            root=target;
        }else if(root.val<target.val){
            addValToTree(root.right, target);

        }else if(root.val>target.val){
            addValToTree(root.left, target);
        }

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