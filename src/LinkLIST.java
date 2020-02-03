class Person
{
    String Name;
    int age;
    double account;
    Person nextperson;

    Person()
    {

    }
    Person(String name, int age, double account, Person nextPerson)
    {
        this.Name=name;
        this.age=age;
        this.account=account;
        this.nextperson=nextPerson;
    }

    public void addPerson(Person que,Person p)
    {
        if(que==null)
        {
            que=p;
        }
        else
        {
            for(;que.nextperson!=null;que=que.nextperson);
            {
                que.nextperson = p;
            }
        }
    }

    public void printLL(Person que)
    {
        for(;que!=null;que=que.nextperson)
        {
            System.out.println(que.Name);
        }
    }

}

public class LinkLIST
{
    public static void main(String []args)
    {
        Person queue= new Person("Tarun",29,12345678,null);
        queue.addPerson(queue,new Person("sukhjit",28,5678,null));
        queue.addPerson(queue,new Person("vinay",29,564678,null));
        queue.addPerson(queue,new Person("ghotra",32,564778,null));
        queue.addPerson(queue,new Person("lakshay",25,564878,null));
        queue.printLL(queue);

    }
}
