package superclass2;

public class Teacher extends Person{   
    private String subject;

    public Teacher() {
        super();
        subject = "";
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public void print() {
        System.out.println();
        System.out.println("--- Teacher ---");
        super.print();
        System.out.println("Subject: " + subject);
        System.out.println();
    }

}
