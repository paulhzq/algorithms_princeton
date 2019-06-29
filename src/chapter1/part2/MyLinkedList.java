class MyLinkedList {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { this.val=x; }
    }

    private ListNode head;
    private int length;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = new ListNode(0);
        this.length = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index>=length) { return -1; }
        ListNode cur = head;
        while(index>=0) {
            cur = cur.next;
            index--;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode ad = new ListNode(val);
        ListNode cur = head;
        ListNode next = cur.next;
        cur.next = ad;
        ad.next = next;
        length++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode cur = head;
        while(cur.next !=null) {
            cur = cur.next;
        }
        ListNode tail = new ListNode(val);
        cur.next = tail;
        length++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        ListNode cur = head;
        if(index>length) return;
        ListNode add = new ListNode(val);
        while(index>0) {
            cur = cur.next;
            index--;
        }
        ListNode next = cur.next;
        cur.next = add;
        add.next = next;
        length++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        ListNode cur = head;
        if(index>length) return;
        while(index>0) {
            cur = cur.next;
            index--;
        }
        cur.next = cur.next.next;
        length--;
    }

    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        //obj.addAtTail(3);
        obj.addAtIndex(1,2);
        obj.get(1);
        //obj.deleteAtIndex(1);
        obj.get(0);
        obj.get(2);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */