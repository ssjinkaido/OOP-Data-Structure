public class LinkedList {
    Node head;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
    Node(){}
}

    public void push(int new_data)
    {

        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    public void insertAtGivenPosition(int new_data,int pos){
        Node prev=new Node();
        Node curr=new Node();
        Node newNode=new Node(new_data);
        int tempPos=0;
        curr=head;
        if(head!=null){
            while(tempPos<pos){
                prev=curr;
                curr=curr.next;
                if(curr==null){
                    break;
                }
                tempPos++;
            }
            if(pos==0){
                push(new_data);
            }
            else if(pos>tempPos){
                System.out.println("\n Position out of bounds");
            }else{
                prev.next=newNode;
                newNode.next=curr;
            }
        }else{
            head=newNode;
            newNode.next=null;
        }
    }

    public void append(int new_data)
    {

        Node new_node = new Node(new_data);

        if (head == null)
        {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;

    }
    void deleteNode(int key)
    {

        Node temp = head, prev = null;

        if (temp != null && temp.data == key)
        {
            head = temp.next; // Changed head
            return;
        }

        while (temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return;

        prev.next = temp.next;
    }

    void deleteNodeAtPosition(int position)
    {

        if (head == null)
            return;

        Node temp = head;

        if (position == 0)
        {
            head = temp.next;
            return;
        }

        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;

        Node next = temp.next.next;

        temp.next = next;
    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args)
    {

        LinkedList llist = new LinkedList();

        llist.append(6);

        llist.push(7);

        llist.push(1);

        llist.append(4);
        llist.append(14);
        llist.append(24);

        System.out.println("\nCreated Linked list is: ");
        llist.printList();
        llist.deleteNode(1);
        System.out.println("\n Linked list after delete one is  ");
        llist.printList();
        llist.deleteNodeAtPosition(2);
        System.out.println("\n Linked list after delete node at position 2 is ");
        llist.printList();
        llist.insertAtGivenPosition(5,2);
        System.out.println("\n Linked list after inserting node 5 at position 2 is ");
        llist.printList();
    }
}