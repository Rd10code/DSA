public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //methods
    public void addFirst(int data){
        // Step 1 = Crete Node
        Node newNode = new Node(data);
        size++;

        if(head ==null){
            head=tail=newNode;
            return;
        }
        // Step 2 = New Node head = head
        newNode.next = head;

        //Setp 3 = newNode Head = head
        head = newNode;
    }

    public void addLast(int data){
        //create a node
        Node newNode =new Node(data);
        size++;

        if(tail==null){
            tail=head=newNode;
            return;
        }
        //tail.next = newNode
        tail.next = newNode;

        //tail = newnode
        tail=newNode;
    }

    public void print(){  //O(n)
        // if(head==null){
        //     System.out.println( "LL is empty");
        //     return;
        // }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int idx ,int data){
        if(idx==0 ){
            addFirst(data);
            return;
        }
        
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        size++;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        // i==idx-1; temp ->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println( "LL is Empty");
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val; 
        }
        int val =head.data;
        head = head.next;
        size--;
        return val;
    }

    public int Removelast(){
        if(size==0){
            System.out.println("LL is empty");
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev = head;
        
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data; //tail data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public int itrsearch(int key){
        Node temp = head;
        int i=0;

        while (temp!=null) {
            if(temp.data == key){ //Key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx =helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int recsearch(int key){
        return helper(head,key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    //Slow Fast Approch
    public Node FindMid(Node head){  // Helper Function
        Node slow = head;
        Node fast = head;
        
        while(fast!=null &&fast.next!=null){
            slow = slow.next;  //+1
            fast = fast.next.next; //+2
        }
        return slow;// middle
    }

    public boolean checkpallidrome(){
        if(head==null || head.next==null){
            return true;
        }
        //step 1 : Find mid

        Node midNode = FindMid(head);

        //Step 2 : Reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr!=null){
            next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right = prev;  //Right hald head
        Node left = head;
        //Step 3 :  check if both are equal

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static boolean cycle(){
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void RemoveCycle(){
        //detect Cycle

        Node slow = head;
        Node fast = head;
        Boolean Cycle = false;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
            if(slow==fast){
                Cycle = true;
                break;
            }
        }
        if(Cycle==false){
            return;
        }
        
        // Find Meeting Point

        slow = head;
        Node prev = null;
        while(slow!=fast){
            prev = fast;
            slow=slow.next;
            fast=fast.next;
        }
        //Remove Cycle
        prev.next = null;
    }

    public static void main(String[] args) {

        // Cycle/ LOOP
        head = new Node(1);
        head.next =new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next = head.next;

        System.out.println(cycle());
        RemoveCycle();
        System.out.println(cycle());
        // 1->2->3->1
        System.out.println(cycle());






        // LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2,3);
        // ll.add(3,6);
        // ll.print();

        // ll.reverse();
        // ll.print();


        // System.out.println(ll.recsearch(3));
        // System.out.println(ll.recsearch(10));

        // LinkedList lll = new LinkedList();
        // lll.addLast(1);
        // lll.addLast(2);
        // lll.addLast(3);
        // lll.addLast(1);

        // System.out.println(lll.checkpallidrome());

        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // // System.out.println(ll.size);
        // ll.Removelast();
        // System.out.println(ll.size);

  
    }
}
