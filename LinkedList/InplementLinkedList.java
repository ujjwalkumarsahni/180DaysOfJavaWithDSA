public class InplementLinkedList{

    public static class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }

        }
        void insertAtBeginning(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }
        void insertAt(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size()){
                insertAtEnd(val);
                return ;
            }
            else if(idx==0){
                insertAtBeginning(val);
            }
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        void deleteAt(int idx){
            Node temp = head;
            if(idx==0){
                head = head.next;
                return;
            }
            for(int i =0;i<idx-1;i++){
                temp= temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }

        int getAt(int idx){
            Node temp = head;
            for(int i=0;i<idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void display(){
            Node temp = head;

            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String args[]){
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);
        ll.insertAtEnd(8);
        ll.insertAtEnd(9);

        ll.insertAtBeginning(100);
        ll.insertAtBeginning(140);

        ll.insertAt(3,1000);
        ll.insertAt(0,1000);
        ll.display();
        ll.deleteAt(0);
        ll.display();
        System.out.println();
        System.out.println(ll.size());


        System.out.println( ll.getAt(6));

       

    }
}