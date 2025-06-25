package Day2;


public class Program08_Students {
    int rollNum;
    String name;
    int marks;
    //all 3 is data members
    void display(){//this is a member function
        System.out.println(rollNum);
        System.out.println(name);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Program08_Students ob = new Program08_Students();
        ob.rollNum=11;
        ob.name="Aiswarya";
        ob.marks=100;
        ob.display();//To get the output

        Program08_Students ob1 = new Program08_Students();
        ob1.rollNum=22;
        ob1.name="Sidhu";
        ob1.marks=99;
        ob1.display();
    }
}
