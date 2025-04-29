class Student1 {
    int rollno;
    String name;
    String college = "UWM";
Student1(int r, String n){
    rollno = r;
    name = n;
}
void display(){
    System.out.println(rollno+" "+name+" "+college);
}
public static void main(String args[]){
    Student1 s1 = new Student1(111, "John");
    Student1 s2 = new Student1(222, "Sally");
    s1.display();
    s2.display();
}
}