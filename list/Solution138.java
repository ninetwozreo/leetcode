package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.lang.model.util.ElementScanner6;

import org.graalvm.compiler.graph.Node;

class Solution138 {
    public static void main(String[] args) {
        Solution138 solution138 = new Solution138();
        int[] A = { 1, 2, 5, 7, 8, 3 };
        int RES = 3;
        System.out.println(RES);
        // System.out.println("输出结果为："+solution138.searchRange("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));

        
    }

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

    public Node copyRandomList(Node head) {
        if(head==null){
            return head;
        }
        Node res= new Node(head.val);
        Node tap=new Node(1);
        Node tata=new Node(2);
        tap.next=res;
        tata.next=res;
        Node th=new Node(1);
        Node ch=new Node(2);;

        th.next=head;
        ch.next=head;
        Map<Node,Node> map= new HashMap<>();

        map.put(th, res);
        th=th.next;
        while(th.next!=null){
            res.next=new Node( th.next.val);

            map.put(th.next, res.next);

            res=res.next;
            th=th.next;
            
        }
        
        tap=tap.next;
        ch=ch.next;
        while(ch.random!=null){
            tap.random=map.get(ch.random);
            tap=tap.next;
            ch=ch.next;            
        }
        
        return tata.next;
    }
}