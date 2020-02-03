public class Runner {


    public static void main(String args[])
    {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
       // list.makeCircular(7);
//        list.insertAtStart(25);
//        list.insertAtIndex(2, 444);
      //  list.deleteAt(2);
        while(list.tail != null)
        {
            System.out.print(list.tail.data);
            list.tail = list.tail.previousNode;
        }

        System.out.println(list.isCircular());


    }
}
