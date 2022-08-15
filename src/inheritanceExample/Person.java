package inheritanceExample;

public class Person {

    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {

        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFname(){
        return this.firstname;
    }

    public String getLname(){
        return this.lastname;
    }

    public void setFname(String fname){
        this.firstname = fname;
    }

    public void setLname(String lname){
        this.lastname = lname;
    }

    @Override
    public String toString() {return "Name:" + this.firstname + " " + this.lastname;}
}
