package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution976 {
    private static Solution976 solution976;
	public static void main(String[] args) {
        solution976 = new Solution976();
        int [] A={1,2,3};
        solution976.largestPerimeter(A);
    }

    int res = 0;
    //976
    public int largestPerimeter(int[] A) {
        List<Integer> path = new ArrayList<Integer>();
        Arrays.sort(A);
        return backtrack(path, A);
        // return res;
    }

    int backtrack(List<Integer> path, int[] A) {
        // int i=0;
        // while(!isValid(path)){
        // path.add(A[i]);
        // i++;
        // }
        // return path.get(0)+path.get(1)+path.get(2);

        if (isValid(path)) {
            res = path.get(0) + path.get(1) + path.get(2);
            // res=res<he?he:res;
        }

        for (int i = A.length - 1; i >= 0; i--) {
            if (res != 0) {
                break;
            }
            if (path.size() < 3) {
                int ab = A[i];
                path.add(A[i]);
                A[i] = -1;
                backtrack(path, A);
                A[i] = ab;
                path.remove(path.size() - 1);
            }
        }
        return res;
    }

    boolean isValid(List<Integer> path) {
        if (path.size() < 3) {
            return false;
        }
        int a = path.get(0);
        int b = path.get(1);
        int c = path.get(2);
        if (a + b <= c || a + c <= b || c + b <= a) {
            return false;
        }
        return true;
    }

}