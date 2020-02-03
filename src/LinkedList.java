public class LinkedList {

    Node head;
    Node tail;

    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.nextNode = null;
        node.previousNode = null;

        if(head == null)
        {
            head = node;
            tail = node;
        }
        else
        {
            Node n = head;
            while(n.nextNode!= null)
            {
                n = n.nextNode;
            }
            n.nextNode = node;
            node.previousNode = n;
            tail = node;
        }
    }

    public void insertAtStart( int data)
    {
        Node node = new Node();
        node.data = data;
        node.nextNode = head;
        head = node;
    }

    public void insertAtIndex(int index, int data)
    {
        Node node = new Node();
        node.data = data;
        node.nextNode =  null;
        Node n = head;
        if(index == 0){
            insertAtStart(data);
        }
        else {

            for (int i = 0; i < index - 1; i++)
            {
                n = n.nextNode;
            }

            node.nextNode = n.nextNode;
            node.previousNode = n;
            n.nextNode = node;
            n.nextNode.previousNode = node;
           // tail = node;
        }
    }

    public void deleteAt(int index)
    {
        if(index == 0)
        {
            head = head.nextNode;
        }
        else
        {
            Node n = head;
            for(int i=0; i<index-1;i++)
            {
                n = n.nextNode;
            }
            Node n1 = n.nextNode;
            n.nextNode = n1.nextNode;
            System.out.println("deleted ELement : "+n1.data);
            n1 = null;

        }
    }

    public void show()
    {
        Node node = head;
        while(node.nextNode!=null)
        {
            System.out.println(node.data);
            node = node.nextNode;
        }
        System.out.println(node.data);
    }

    public boolean isCircular()
    {
        boolean circular =  false;
        Node n = head;
        n = n.nextNode;
        for(;;)
        {
            if(n.nextNode==null || n == null)
            {
                circular = false;
                break;
            }
            else if(n == head) {
                circular = true;
                break;
            }

            n = n.nextNode;

        }
        return circular;
    }

    public void makeCircular(int data){
        Node node = new Node();
        node.data = data;
        node.nextNode = null;
        Node h = head;
        while(h.nextNode!=null)
        {
            h = h.nextNode;
        }
        h.nextNode = node;
        node.nextNode = head;
    }

}
