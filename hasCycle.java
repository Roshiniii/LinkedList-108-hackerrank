    // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
       if(head == null || head.next == null) return false;
        
        SinglyLinkedListNode fast = head;
        SinglyLinkedListNode slow = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow)
                return true;
        }
        return false;

    }
