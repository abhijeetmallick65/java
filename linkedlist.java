public class linkedlist {
    // public head 
    private Node head = null;

    // class node
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // insert
    public void insert(int data){
        Node n = new Node(data);
        Node last = head;
        if(head == null){
            head = n;
        }else{
            while(last.next !=null){
                last = last.next;
            }
            last.next = n;
        }
    }
    
    // display
    public void display(){
        Node p = head;
        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }
}
