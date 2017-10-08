package leonxtp;

import leonxtp.medium.ListNode;

public class utils {

    /*
     * List转int方法完全不可行，长度超出范围！
     */

    private int nodeListToInt(ListNode listNode) {
        if (listNode != null) {
            int value = listNode.val;
            int multiple = 1;
            while (listNode.next != null) {
                multiple *= 10;
                value += listNode.next.val * multiple;
                listNode = listNode.next;
            }
            return value;
        }
        return 0;
    }

    private ListNode int2NodeList(int value) {
        int compareValue = 1;
        int multiple = 1;
        ListNode listNode = null;
        ListNode tempNode = null;
        do {
            if (null == listNode) {
                listNode = new ListNode((value % (10 * multiple)) / multiple);
                tempNode = listNode;
            } else {
                tempNode.next = new ListNode((value % (10 * multiple)) / multiple);
                tempNode = tempNode.next;
            }
            multiple *= 10;
            compareValue *= 10;
        } while (value > compareValue);
        return listNode;
    }

}
