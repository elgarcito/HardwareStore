import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomLinkedList<T> {
    private static final Logger LOGGER= LogManager.getLogger(CustomLinkedList.class);
    //The first Node element in the linked list
    private Node<T> head;
    //The final Node element in the linked list
    private Node<T> tail;
    public class Node<T>{
        //The data that the node has inside
        T data;
        //the nextNode pointer
        Node<T> nextNode =null;
        //constructor of the node
        public Node(T data){
            this.data=data;
        }
    }

    //Now the methods that interact with the nodes
    //print every element in the list
    public void printData(){
        //I create a new node and i assing the first element
        Node<T> actualNode=head;
        //I create a while that when a the actual node is not null it print the data of the node
        while (actualNode!=null){
            LOGGER.info(actualNode.data);
            actualNode=actualNode.nextNode;
        }
        System.out.println();
    }

    //Method to add an element to the linked list

    public void addNode(T data){
        //Create a new Node element with the new data
        Node<T> newNode=new Node<T>(data);
        //Check if the first node is null or not
        if (head==null){
            head=newNode;
            return;
        }
        //Turn the actual node in the first Node
        Node<T> actualNode=head;
        /*While the actual node is not null check if the next node is null
        if it is null we now that the actual node is the last node and we save it
        in the tail Node.
        Then we pass to the next element entering into the actualNode.next and make that node
        the actual node
         */
        while (actualNode!=null){
            if (actualNode.nextNode==null){
                tail=actualNode;
            }
            actualNode=actualNode.nextNode;
        }
        //Once we find that the actual node is null we add to the next element
        //of the tail the newNode with the new data
        tail.nextNode=newNode;
    }

    public void deleteNode(T data){
        //The previous node, it saves the information of the previous node
        Node<T> previousNode=new Node<>(null);
        //The node that we have to delete
        Node<T> deletNode=new Node<>(data);
        //The next node that its going to replace the actualnode.next
        Node<T> nextNode=new Node<>(null);
        //If the data is the same we delete the whole arrayList
        if (head.data==deletNode.data){
            head=null;
            return;
        }
        //Here we start to iterate thug the array
        Node<T> actualNode=head;
        try {
            //While the information in the data Node is different to the one thath we want to delete
            //we save the information of the actual node in the previous node and advance to the
            //next node using the actual node
            while (actualNode.data!=deletNode.data){
                previousNode=actualNode;
                actualNode=actualNode.nextNode;
            }
            //Once we find the element we save the information of the next element
            // of thath node in the nextNode
            nextNode=actualNode.nextNode;
            //finally we delete the desired element (actual node) assing the following node to the
            //previousNode.nextNode
            previousNode.nextNode=nextNode;
            return;
            //If the element is not in the array an error is going to appear
        }catch (NullPointerException e){
           LOGGER.error("The element was not in the array "+e);
        }catch (Exception f){
            LOGGER.error("Another error happened"+f);
        }

    }






}

