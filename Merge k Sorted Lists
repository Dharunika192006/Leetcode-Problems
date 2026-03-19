/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        return mergeSort(lists,0,lists.length-1);
    }

    public static ListNode mergeSort(ListNode[] lists,int low,int high){
        if(low == high){
            return lists[low];
        }
        int mid=low+(high-low)/2;
        ListNode l1=mergeSort(lists,low,mid);
        ListNode l2=mergeSort(lists,mid+1,high);
        return mergeTwoSortedLists(l1,l2);
    }

    public static ListNode mergeTwoSortedLists(ListNode l1,ListNode l2){
        ListNode temp=new ListNode(0);
        ListNode current=temp;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                current.next=l1;
                l1=l1.next;
            }
            else{
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }

        while(l1 != null){
            current.next=l1;
            l1=l1.next;
            current=current.next;
        }

        while(l2 != null){
            current.next=l2;
            l2=l2.next;
            current=current.next;
        }
        return temp.next;
    }
}
