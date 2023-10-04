public class Studet {
    private String name;
    private int age;
    private char grade;

    Studet() {
        name = "Joe";
        age = 23;
        grade = 'A';
    }

    Studet(String n, int a, char g) {
        name = n;
        age = a;
        grade = g;
    }

    Studet(String n, int a) {
        name = n;
        age = a;
        grade = 'N';
    }

    void displayInfo() {
        System.out.println("Name:" + name);  //System.out.println(name+ +age+ +grade);
        System.out.println("Age:" + age);
        System.out.println("Grade:" + grade);

    }
}
