
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Write your code here
              SinglyLinkedListNode current = new SinglyLinkedListNode(data);
        
        if(position == 0){
            current.next = llist;
            llist = current;
            return llist;
        }
        
        SinglyLinkedListNode node = llist;
        for(int i=1;i<position;i++)
            node = node.next;
        current.next = node.next;
        node.next = current;
        
        return llist;

    }
