package inheritanceExample;

public class Student extends Person{

    private String studentId;

    public Student(String firstname, String lastname, String studentId) {

        super(firstname, lastname);
        this.studentId = studentId;
    }

    public String getStudentId() {

        return this.studentId;
    }

    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    @Override
    public String toString() {return super.toString() + " Student Id:" + this.studentId;}

}
