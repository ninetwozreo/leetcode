package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeLength {
	public static void main(String[] args) {
        ThreeLength solution15 = new ThreeLength();
        int [] A={0,0,0,0};
        double X=200000401.1;
        double Y=202345671.1;
        double Z=202134551.1;
        // solution121.largestPerimeter(A);
        System.out.println("输出结果为："+solution15.threeLength( X, Y , Z)); 

    }
    // 三根 XYZ 钢管 返回可以截取的最大长度

    // 注意：答案中不可以包含重复的三元组。
    
    //  
    //  
    public double threeLength(double X,double Y,double Z) {
        double aeq=(X+Y+Z)/1000;
        double bft=aeq;
        while(((int)(X/aeq))+((int)(Y/aeq))+((int)(Z/aeq))<1000){
            bft=aeq;
            aeq=aeq/2;
        }

        while(bft!=aeq){
            double half =(bft+aeq)/2;
            int nval=((int)(X/half))+((int)(Y/half))+((int)(Z/half));
            if(nval<1000){
                bft=half;
            }else if(nval>1000){
                aeq=half;
            }else{
                break;
            }
            if (bft-aeq<0.000000000000001){
                break;
            }
            
        }
        return bft;
    }



}