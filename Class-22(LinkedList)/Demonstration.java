public class Demonstration {

    //creating class for node
    public static class Node{
        //two properties of node
        int data;
        Node next;

        //constructor for initializing the values
        public Node(int data){
            this.data = data;
            this.next = null;   //first it's set as null
        }
    }

    //two main pointers or variables for addition or deletion
    public static Node head;
    public static Node tail;
    public static int size;    //calculate size

    //method for adding node at first
    public void add_first(int data){
        //step1 -> create new node
        Node newNode = new Node(data);
        size++;

        //base case if LL is empty compare with head
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step-2 --> newNode points to next head
        newNode.next = head;    //link

        //step-3 --> head = newNode
        head = newNode;
    }

    //method for adding node at last
    public void add_last(int data){
        //step1 -> create new node
        Node newNode = new Node(data);
        size++;

        //base case if LL is empty compare with head
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step-2 --> newNode points to next tail
        tail.next = newNode;

        //step-3 --> tail = newNode
        tail = newNode;
    }

    //method for adding node in middle of LL
    public void add_in_middle(int idx, int data){
        //if index is 0 then add node at first
        if(idx == 0){
            add_first(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        //if we want add 2nd index then we must find 1st index and add the node
        while(i < idx-1){
            temp = temp.next;   //next node until condition true
            i++;
        }

        //i = idx-1; temp ->  prev
        newNode.next = temp.next;   //new node next pointing to previous node
        temp.next = newNode;    //assign
    }

    //method for remove at first
    public int remove_at_first(){
        if(size == 0){  //if LL is empty return empty
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) { //if LL has only one element, then remove the head
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //if LL is has node then remove at first
        int val = head.data;;
        head = head.next;   //removing one head next to anothe then it automatically remove that node
        size--;
        return val;
    }

    //method for remove at first
    public int remove_at_last(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //prev: i = size - 2 loop for iterating finding second last node
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        //found second last node and make that node.next = null
        int val = prev.next.data;   //getting tail.data
        prev.next = null;   //remove operation
        tail = prev;
        size--;
        return val;
    }

    //method for printing
    public void print(){
        Node temp = head;   //temp for traversing and printing the Data

        //loop runs until it goes last node
        while (temp != null){
            System.out.print(temp.data +"->");  //print data
            temp = temp.next;   //move to next node
        }
        System.out.println("null");
    }

    //Q1--> Iterative Search --> O(n)
    public int iterative_search(int key){
        Node temp = head;
        int i=0;

        //finding key
        while(temp != null){
            if(temp.data == key){
                return i;   //key found
            }
            temp = temp.next;
            i++;
        }

        return -1;  //key isn't found
    }

    //Q2 --> Recursive search
    //helper function
    public int helper(Node head, int key){
        //if LL is null
        if(head == null){
            return -1;
        }

        //key found
        if(head.data == key){
            return 0;
        }

        //recursive call
        int idx = helper(head.next,key);

        //not found
        if(idx == -1){
            return -1;
        }

        //found returning index
        return idx+1;
    }

    public int recursive_search(int key){
        return helper(head,key);
    }

    //Q2 --> reverse LL
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    //Q-3 --> find and remove nth node from end
    public void delete_nth_from_end(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;   //remove First
            return;
        }

        //sz-n --> find previous node
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){ //find prev node
            prev = prev.next;
            i++;
        }

        //remove node
        prev.next = prev.next.next;
        return;
    }

    //Q4 --> Check if LL is palindrome or not
    //slow fast approach
    public Node find_mid(Node head){
        //both node points to the head
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;   //increment by 1
            fast = fast.next.next;  //increment by 2
        }

        return slow;    //slow is my midNode
    }

    public boolean check_palindrome(){
        //empty or one node then true
        if(head == null || head.next == null){
            return true;
        }

        //step-1 --> find mid
        Node midNode = find_mid(head);

        //step-2 --> reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;  //right half head
        Node left = head;   //left half head

        //step-3 --> check left half & right half
        while (right != null){
            if(left.data != right.data){
                return false;   //not palindrome
            }
            left = left.next;   //next left node
            right = right.next; //next right node
        }

        return true;
    }

    public static void main(String[] args) {
        Demonstration demo = new Demonstration();
        demo.add_first(1);
        demo.add_first(2);
        demo.add_last(2);
        demo.add_last(1);
//        demo.add_in_middle(2,9);
        demo.print();
//        System.out.println(demo.size);
//        demo.remove_at_first();
//        demo.print();
//        demo.remove_at_last();
//        demo.print();
//        System.out.println(demo.iterative_search(2));
//        System.out.println(demo.recursive_search(2));
//        demo.reverse();
//        demo.print();
//        demo.delete_nth_from_end(2);
//        demo.print();
        System.out.println(demo.check_palindrome());
    }
}
