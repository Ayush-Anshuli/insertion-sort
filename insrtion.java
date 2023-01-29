import java.util.*;
public class insrtion {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node  head;
    public static Node tail;

    public  void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }

    public void print(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        insrtion ll=new insrtion();
        System.out.println("enter the number");
        ll.addfirst(sc.nextInt());
        ll.print();

        ll.addfirst(sc.nextInt());
        ll.print();

        ll.addfirst(sc.nextInt());
        ll.print();

        ll.addfirst(sc.nextInt());
        ll.print();

        ll.addfirst(sc.nextInt());
        ll.print();
    }
}
