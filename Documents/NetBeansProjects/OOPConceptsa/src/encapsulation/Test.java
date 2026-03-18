package encapsulation;

public class Test {
    public static void main(String[] args) {
   
        // Step 1 - create a Student     
        Student s = new Student();  
        
        s.setStudentName("Jude");
 
        // Step 2 - create a StudentCouncil
        StudentCouncil sc = new StudentCouncil();
        sc.setrole("President");
        sc.setallowance(50000);
        
        // Step 3 - lin StudentCouncil to the Student
        s.setCouncil(sc);
        
        // Step 4 - access the council through the student
        System.out.println("Student: " + s.getStudentName());
        s.getCouncil().introduce();
    }
}
