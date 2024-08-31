package DAY_35;
public class BasicLinkList{
    public static void Display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void DisplayR(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        DisplayR(head.next);
    }
    public static void DisplayReverse(Node head){
        if(head==null) return ;
        DisplayReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static int length(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
         Node a = new Node(5);
         Node b = new Node(4);
         Node c = new Node(7);
         Node d = new Node(1);
         Node e = new Node(2);
         Node f = new Node(20);

         a.next = b;
         b.next = c;
         c.next = d;
         d.next = e;
         e.next = f;
         
        //  First way of display linkedList
        //  System.out.print(a.data + " ");
        //  System.out.print(b.data + " ");
        //  System.out.print(c.data + " ");
        //  System.out.print(d.data + " ");
        //  System.out.print(e.data + " ");
         
        // System.out.println();

        // Second way of display linkedList
        //  System.out.print(a.data + " ");
        //  System.out.print(a.next.data + " ");
        //  System.out.print(a.next.next.data + " ");
        //  System.out.print(a.next.next.next.data + " ");
        //  System.out.print(a.next.next.next.next.data + " ");

        // System.out.println();
        // // Third way of display linkedList
        //  Node temp = a;
        //  for(int i = 1;i<=5;i++){
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        //  }

        //  System.out.println();
        // Fourth way of display linkedList
        //  Node temp = a;
        //  while(temp !=null){
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        //  }

         System.out.println();
         Display(a);
        //  System.out.println();
        //  DisplayR(a);

        //  System.out.println();
        //  DisplayReverse(a);

         System.out.println();

         System.out.println("Length of LinkedList = "+length(a));
    }
}



