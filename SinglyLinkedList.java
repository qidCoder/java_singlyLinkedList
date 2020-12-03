public class SinglyLinkedList{
    public Node head;//create variable head of type Node

    // Create a constructor method that sets the head to null of your SinglyLinkedList objects
    public SinglyLinkedList(){
        this.head = null;//set head

    }

    //SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value){
        Node newNode = new Node(value);//create variable newNode of type Node and value value
        if(head == null){
            head = newNode;
        }
        else {
            Node runner = head;//create a runner at the head 
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    // Create a remove() method that will remove a node from the end of your list
    public void remove(){
        //take runner to end of list
        Node runner = head;
        while(runner.next.next != null){
            runner = runner.next;
        }

        //set runner to null to remove the last node
        runner.next = null;
    }


    // Create printValues() method that will print all the values of each node in the list in order
    public void printValues(){
        Node runner = head;

        while(runner != null){
            System.out.println(runner.value);
            runner = runner.next;
        }
    }
}