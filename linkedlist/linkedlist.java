package linkedlist;
public class linkedlist {
    private llnode head;
    public linkedlist(){
        this.head = null;
    }
    public void insert(int data){
        llnode newNode = new llnode(data);
        if(head == null){
            head = newNode;
        } else{
            llnode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }

    }
    public void display(){
        llnode current = head;
        while(current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
