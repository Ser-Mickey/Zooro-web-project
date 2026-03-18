package encapsulation;

public class Student {
    private String studentName = "Jude"; 
    
    // Student is part of Sudent Council
    private StudentCouncil council;
    
    //getter
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    // getter and setter for student council
    public StudentCouncil getCouncil (){
        return council;
    }
    public void setCouncil(StudentCouncil council) {
        this.council = council;
    }
    
}
