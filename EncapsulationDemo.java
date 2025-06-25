public class EncapsulationDemo {

    private int ssn;
    private String empName;
    private int empAge;
    //Getter and Setter Methods
    public int getEmpSSN(){
        return ssn;
    }
    public String getEmpName(){
        return empName;
    }
    public int getEmpAge(){
        return empAge;

    }
    public void setEmpAge(int newValue){
        empAge = newValue;
    }
    public void setEmpName(String newValue){
        empName = newValue;
    }
    public void setEmpSSN(int newValue){
        ssn = newValue;
    }
    public static void main(String[] args){
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setEmpName("John");
        obj.setEmpAge(32);
        obj.setEmpSSN(112244);
        System.out.println("Employee Name: "+obj.getEmpName());
        System.out.println("Employee Age:"+obj.getEmpAge());
        System.out.println("Employee SSN: "+obj.getEmpSSN());
    }
}