package pers.muummer86.a01.task01;

public class TwoNumAdd {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //创建结果集合
        ListNode resultListNode = new ListNode();
        //创建临时集合,用于存储集合两个集合相加的结果
        ListNode tempListNode = resultListNode;
        int sum;
        int carryNum = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            sum = x + y + carryNum;

            carryNum = sum / 10;

            sum = sum % 10;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
            tempListNode.next = new ListNode(sum);
            tempListNode = tempListNode.next;
        }

        if (carryNum == 1) {
            tempListNode.next = new ListNode(1);
        }

        return resultListNode.next;
    }

}
