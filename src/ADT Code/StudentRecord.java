
public class StudentRecord {
    private String name;
    private double gpa;
    private int Ssn;

    public StudentRecord(String name, double gpa, int Ssn) {
        this.name = name;
        this.gpa = gpa;
        this.Ssn = Ssn;
    }

    public int getSsn() {
        return Ssn;
    }

    public String toString(){
        return name + ". GPA = " + gpa + ". SSN: " + Ssn + ".";
    }
    
}
