package encapsulation;

public class StudentCouncil {
    private String role;
    private int allowance;
    
    // getter and setter for role
    public String getrole (){
        return role;
    }
    
    public void setrole (String role) {
        this.role = role;
    }
    // getter and setter for allowance
    public int getallowance(){
        return allowance;
    }
    
    public void setallowance (int allowance){
        this.allowance = allowance;
    }
    
    /// introduce method
        public void introduce(){
        System.out.println ("I am " + role);
        System.out.println ("My allowance is " + allowance);
        
    }
    
    
}
