package java;

// Runtime: 12 ms
// Memory Usage: 39.7 MB

import java.math.BigInteger;
import java.util.ArrayList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> first = new ArrayList<Integer>();
        ArrayList<Integer> second = new ArrayList<Integer>();
        String firstNum = "";
        String secondNum = "";

        first.add(l1.val);
        while (l1.next != null) {
            first.add(l1.next.val);
            l1 = l1.next;
        }

        second.add(l2.val);
        while (l2.next != null) {
            second.add(l2.next.val);
            l2 = l2.next;
        }

        for (int i = first.size() - 1; i >= 0; i--) {
            firstNum += first.get(i);
        }

        for (int i = second.size() - 1; i >= 0; i--) {
            secondNum += second.get(i);
        }

        BigInteger a = new BigInteger(firstNum);
        BigInteger b = new BigInteger(secondNum);

        BigInteger answer = a.add(b);
        String answ = String.valueOf(answer);

        ListNode firstNode = new ListNode(Character.getNumericValue(answ.charAt(answ.length() - 1)));
        ListNode current = firstNode;
        for (int i = answ.length() - 2; i >= 0; i--) {
            current.next = new ListNode(Character.getNumericValue(answ.charAt(i)));
            current = current.next;
        }

        return firstNode;
    }
}