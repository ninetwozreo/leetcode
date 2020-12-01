// 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

// 示例 1：

// 输入: "babad"
// 输出: "bab"
// 注意: "aba" 也是一个有效答案。
// 示例 2：

// 输入: "cbbd"
// 输出: "bb"

// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution5 {
	public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int [] A={1,2,3};
        System.out.println("输出结果为："+solution5.longestPalindrome("babad")); 
    }

    String res="";
    //可用 但是超出内存限制
    public String longestPalindrome(String s) {

        return tranverse(s);
    }

    String tranverse(String s){
        if(s.length()<=1){
            return s;
        }
        Map<String,Boolean> valid=new HashMap<>();
        int lt,rt,rtt;
        String testS;
        boolean judge;
        Boolean hb;
        for(int i=0;i<s.length();i++){
          lt=rt=i;
        //   if(res.length()>)
          //是否相邻判断
        //   if(i>0&&i<s.length()-1){
        //     if(s.charAt(i)==s.charAt(i+1)){
        //         rt++;
        //         String testS=s.substring(lt, rt+1);
                
        //         res=res.length()>testS.length()?res:testS;

        //     }

        //   }
          
          rtt=i+1;
          while(lt>=0&&rt<=s.length()){
            testS=s.substring(lt, rt);
               hb=valid.get(testS);
              if(hb!=null){
                    judge=hb;
              }else{
                judge=isValid(testS);
                if(judge){
                    valid.put(testS, judge);
    
                   }
              }
              if(judge){

                res=res.length()>testS.length()?res:testS;
                
              }
              

              if(rtt<=s.length()){
              
              testS=s.substring(lt, rtt);
              hb=valid.get(testS);
             if(hb!=null){
                   judge=hb;
             }else{
               judge=isValid(testS);
               if(judge){
                valid.put(testS, judge);

               }
             }
             if(judge){

             res=res.length()>testS.length()?res:testS;
               
             }
            }
             lt--;
             rt++;
             rtt++;

          }
        //   lt=rt=i;
        //   rt+=1;
        //   while(lt>=0&&rt<=s.length()){
        //   testS=s.substring(lt, rt);
        //        hb=valid.get(testS);
        //       if(hb!=null){
        //             judge=hb;
        //       }else{
        //         judge=isValid(testS);
        //         valid.put(testS, judge);
        //       }
        //       if(judge){

        //       res=res.length()>testS.length()?res:testS;
                
        //       }
        //       lt--;
        //       rt++;
        //   }
        }
        
        return res;
    }
    boolean isValid(String testS){
        if(testS.length()<=1){
            return true;
        }
        int lt=0;
        int rt=testS.length()-1;
        while(lt<=rt){
           if(testS.charAt(lt)==testS.charAt(rt)) {
            lt++;
            rt--;
           }else{
               return false;
           }
            
        }
        return true;
        
    }
}