package leonxtp.medium;

public class AddTwoNumbers {

    public static void main(String args[]) {
        ListNode l1 = new ListNode(5);
//        l1.next = new ListNode(6);
//        l1.next.next = new ListNode(2);
//        l1.next.next.next = new ListNode(1);
//        l1.next.next.next.next = new ListNode(3);
//        l1.next.next.next.next.next = new ListNode(4);
//        l1.next.next.next.next.next.next = new ListNode(9);
//        l1.next.next.next.next.next.next.next = new ListNode(3);
//        l1.next.next.next.next.next.next.next.next = new ListNode(5);
//        l1.next.next.next.next.next.next.next.next.next = new ListNode(1);

        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(9);
//        l2.next.next.next = new ListNode(9);
//        l2.next.next.next.next = new ListNode(1);
//        l2.next.next.next.next.next = new ListNode(4);
//        l2.next.next.next.next.next.next = new ListNode(4);
//        l2.next.next.next.next.next.next.next = new ListNode(0);
//        l2.next.next.next.next.next.next.next.next = new ListNode(5);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(result.val + ", ");
        while (result.next != null) {
            System.out.println(result.next.val + ", ");
            result = result.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int[] addValues = getAddedValues(l1.val, l2.val);
        ListNode listNode = new ListNode(addValues[0]);
        ListNode tempNode = listNode;
        while (l1.next != null || l2.next != null) {

            int overValue = addValues[1];
            if (l1.next != null && l2.next != null) {
                addValues = getAddedValues(l1.next.val, l2.next.val, overValue);
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1.next != null) {
                addValues = getAddedValues(l1.next.val, 0, overValue);
                l1 = l1.next;
            } else {
                addValues = getAddedValues(0, l2.next.val, overValue);
                l2 = l2.next;
            }
            tempNode.next = new ListNode(addValues[0]);
            tempNode = tempNode.next;
        }
        if (addValues[1] != 0) {
            tempNode.next = new ListNode(addValues[1]);
        }
        return listNode;
    }

    private int[] getAddedValues(int v1, int v2) {
        return new int[]{v1 + v2 >= 10 ? v1 + v2 - 10 : v1 + v2
                , v1 + v2 >= 10 ? 1 : 0};
    }

    private int[] getAddedValues(int v1, int v2, int v3) {
        return new int[]{v1 + v2 + v3 >= 10 ? v1 + v2 + v3 - 10 : v1 + v2 + v3
                , v1 + v2 + v3 >= 10 ? 1 : 0};
    }

}
