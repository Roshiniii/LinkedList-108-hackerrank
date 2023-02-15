    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
        
        if(head == null){
            head = new_node;
            return head;
        }
        
        while(current.next != null){
            current= current.next;
        }
        
        current.next = new_node;
        return head;
    }
