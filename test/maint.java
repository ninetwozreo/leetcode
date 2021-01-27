package test;

import backTracking.*;
import jdk.nashorn.api.tree.NewTree;
import jdk.nashorn.api.tree.Tree;
class maint{
    
    
    public static void main(String[] args) {
        Integer[] A ={-10,9,20,null,null,15,7};
       maint m= new maint();
       m.getTree(A);
    }
    public static TreeNode   getTree(Integer[] nums) {

        TreeNode res;
        if(nums.length==0){
            return null;
        }else {
            res=new TreeNode(nums[0]);
        }
        TreeNode top=res;

        TreeNode bf=res;


        //上来先接左子树
        // boolean leftF=true;
        // boolean l0=true;
        // boolean r0=true;

        for (int i=1;i<nums.length;i++){
            Integer curVal= nums[i];
            boolean result=takeOne(res, curVal);
            if(result){

                if(bf.left==null){
                    res=res.left;
                }else if(bf.right==null){
                    
                }
                
            }
            

        }

        return null;
//         for (int i=1;i<nums.length;i++){
//             Integer curVal= nums[i];

//             if(res.left==null&&leftF&&l0){
//                 if(curVal!=null){
//                     res.left=new TreeNode(nums[i]);
//                 }else{
//                     l0=false;
//                 }
//                 leftF=!leftF;
//                 continue;
//             }
//             if(res.right==null&&!leftF&&r0){
//                 if(curVal!=null){
//                     res.right=new TreeNode(nums[i]);
//                 }else{
// //加标是
//                     r0=false;
//                 }
//                 leftF=!leftF;

//                 continue;
//             }
//             res=res.left!=null&&!l0&&!r0?res.left:res.right;
//             l0=r0=false;
//             i--;
       
//         }
//         return res;
    }

    //加进来为true 没加进来为false
    public static boolean takeOne(TreeNode res,Integer val){
        if(val==null){
            return false;
        }
            res=new TreeNode(val);
           
            return true;

    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
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