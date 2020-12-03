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

    // Optional Challenges:
    // Implement a find(int) method that will return the first node with the value in the parameter
    public Node find(int val){
        Node runner = head;

        while(runner != null){
            if(runner.value == val){
                return runner;
            }

            runner = runner.next;
        }

        return null;
    }

    // Implement a removeAt(int) method that will remove the node after n nodes, where n is the parameter. For example, if n is 0, remove the first node. If n is 1, remove the second node. Similar to Arrays.
    public void removeAt(int n){
        Node runnerL = head;
        Node runnerR;

        //case if n is 0
        if(n == 0){
            runnerR = runnerL.next;
            runnerL.next = null;
            head = runnerR;
        }
        else{

            for(int i = 0; i < n - 1; i++){
                runnerL = runnerL.next;
            }

            runnerR = runnerL.next.next;//set the right runner to be the start of the list to the right of the node to be removed

            runnerL.next = null;//remove the rest of the list 

            runnerL.next = runnerR;//add on the rest of the list after the node removed
        }
    }

}