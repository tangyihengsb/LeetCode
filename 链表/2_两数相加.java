/*
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

​ 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

​ 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

*/


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, cur = result;
        //表示进位
        int carry = 0;
        while(p != null || q != null){
            int a = (p != null) ? p.val : 0;
            int b = (q != null) ? q.val : 0;
            int sum = a + b + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            
            if(p != null) p = p.next;
            if(q != null) q = q.next;
            
        }
        if(carry > 0){
            cur.next = new ListNode(carry);
        }
        return result.next;
    }
}
