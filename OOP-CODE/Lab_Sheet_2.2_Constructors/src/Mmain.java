public class Mmain {
    public static void main(String []args){
        Studet obj1=new Studet();
        System.out.println("Student 1 Information");
        obj1.displayInfo();

        Studet obj2=new Studet("IRUSHI", 20, 'B');
        System.out.println("Student 2 Information");
        obj2.displayInfo();

        Studet obj3 =new Studet("FERNANDO", 21);
        System.out.println("Student 3 Information");
        obj3.displayInfo();


    }
}