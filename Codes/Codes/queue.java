package Codes;

public class queue {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue{
        Node head = null;
        Node tail = null;

        public boolean isEmpty(){
            return head == null && tail == null;
        }

        public int add(int data){
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                tail = head;
            }
            tail.next = newNode;
            tail = newNode;
            return tail.data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int removed = head.data;
            if(head == tail) tail = null;
            head = head.next;
            return removed;
        }

        public int peek(){
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}