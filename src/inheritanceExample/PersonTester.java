package inheritanceExample;

public class PersonTester {

    public static void main(String[] args) {

        Person Nick = new Person("Nick", "Nelson");
        System.out.println(Nick);
        Student Matt = new Student("Matt", "Nelson", "1234");
        System.out.println(Matt);
        StudentEmployee Shane = new StudentEmployee("Shane", "Fiek", "1235", "1234", 125.50);
        System.out.println(Shane);
    }
}
