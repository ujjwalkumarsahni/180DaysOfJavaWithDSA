public class basic{
    public static void display(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayRecursively(Node head){
        if(head == null) {
            return;
        }

        System.out.print(head.data + " ");

        displayRecursively(head.next);
    }
    public static class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String args[]){
        Node a = new Node(10); // head node
        Node b = new Node(11);
        Node c = new Node(23);
        Node d = new Node(34);
        Node e = new Node(34);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // System.out.print(a.data);
        // System.out.print(a.next.data);
        // System.out.print(a.next.next.data);
        // System.out.print(a.next.next.next.data);
        // System.out.print(a.next.next.next.next.data);

        // display the data
        // Node temp = a;
        // for(int i = 1;i<=5;i++){
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }

        // Node temp = a;
        // while(temp != null){
        //     System.out.print(temp.data+ " ");
        //     temp = temp.next;
        // }

        display(a);
        System.out.println();
        displayRecursively(a);
    }
}