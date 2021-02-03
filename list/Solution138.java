package list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.lang.model.util.ElementScanner6;

class Solution138 {
    public static void main(String[] args) {
        Solution138 solution138 = new Solution138();
        int[] A = { 1, 2, 5, 7, 8, 3 };
        int RES = 3;
        System.out.println(RES);
        // System.out.println("输出结果为："+solution138.searchRange("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));

        
    }

   
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