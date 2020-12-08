package bfs;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {
  public int openLock(String[] deadends, String target) {
      int step =0;
      Queue<String> q=new LinkedList<>();
      Set<String> deads=new HashSet<>();
      for(String s:deadends){
          deads.add(s);
      }
      q.offer("0000");

      while (!q.isEmpty()){
          int cz=q.size();

          

          for(int i=0;i<cz;i++){
              String ns=q.poll();
              if(deads.contains(ns)){
                  continue;
              }
              if(ns.equals(target)){
                  return step;
              }
              for(int j=0;j<=3;j++){
                  String up=upOne(ns,j);
                  if(!deads.contains(up)){
                      q.offer(up);
                      deads.add(up);
                  }

                  String down=downOne(ns,j);
              
                  if(!deads.contains(down)){
                      q.offer(down);
                      deads.add(down);
                  }
              }
          }
          step++;
      }
      return -1;
  }

  String upOne(String ns,int index){
     char[] ar1= ns.toCharArray();
     if(ar1[index]=='9'){
         ar1[index]='0';
     }else{
         ar1[index]++;
     }
     return ar1.toString();

  }
     String downOne(String ns,int index){
     char[] ar1= ns.toCharArray();
     if(ar1[index]=='0'){
         ar1[index]='9';
     }else{
         ar1[index]--;
     }
     return ar1.toString();

  }

}