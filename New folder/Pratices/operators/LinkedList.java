import java.util.*;
class LinkedList
{
    Node head;
    class Node
    {
        int data;
        Node next;   
        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    LinkedList()
    {
        head=null;
    }
    
    public void insertfront(int val)
    {
        Node newnode=new Node(val);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            newnode.next=head;
            head=newnode;
        }
    }
     public void delfront()
    {
        head=head.next;
    }
    public void dellast()
    {
        Node temp=head;
        if(temp==null)
        {
            System.out.println("list is null");
        }
        if(temp.next==null)
        {
            temp=null;
        }
        else
        {
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
             
            temp.next=null;
        }
    }
     public void delpos(int pos)
    {
        Node temp=head;
        Node prev=null;
         for (int i=1;i<=pos;i++)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
     public void minele(){
        int min=head.data;
        Node temp=head;
        while(temp!=null){
            if(min>temp.data){
                min=temp.data;
            }
            temp=temp.next;
        }
            System.out.println(min);
    }
    public void maxele(){
        int max=head.data;
        Node temp=head;
        while(temp!=null){
            if(max<temp.data){
                max=temp.data;
            }
            temp=temp.next;
        }
            System.out.println(max);
    }
    public void search(int a){
        Node temp=head;
        boolean found=false;
        while(temp!=null){
            if(a==temp.data){
                found=true;
                break;
            }
            temp=temp.next;
        }
        if(found)
        System.out.println("Element found");
        else
        System.out.println("Not found");
    }
    public void sort(){
        if(head==null || head.next==null)
        display();
        else{
            Node curr=head;
            Node index=null;
            int temp;
            for(curr=head;curr!=null;curr=curr.next){
                index=curr.next;
                for(index=curr.next;index!=null;index=index.next){
                    if(curr.data>index.data){
                        temp=curr.data;
                        curr.data=index.data;
                        index.data=temp;
                    }
                }
            }
        }
    }
    public void display()
    {
        Node temp=head;
        while (temp!=null)
        {
            if(temp.next==null)
            {
                System.out.print(temp.data);    
            }
            else
            {
                System.out.print(temp.data + "->");
            }
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        LinkedList l = new LinkedList();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the inputs: ");
        int n = in.nextInt();//4
        int count=0;
        while(n>0)
        {
            l.insertfront(n);
            count++;
            n=in.nextInt();    
        }
        System.out.println("total count is : " + count);
        System.out.println("final list is : ");
        l.display();
        l.delfront();
        System.out.println("after del front : ");
        l.display();
        l.dellast();
        System.out.println("after del last : ");
        l.display();
        System.out.println("enter pos: ");
        int pos = in.nextInt();
        l.delpos(pos);
        System.out.println("after del at pos: ");
        l.display();
        System.out.println("MIN ELE is :");
        l.display();
        l.minele();
        System.out.println("MAX ELE IS :");
        l.display();
        l.maxele();
        System.out.println("Enter A input to search:");
        int a=in.nextInt();
        l.search(a);
        System.out.println("After Sorting :");
        l.sort();
        l.display();
    }
}