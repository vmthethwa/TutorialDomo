
public class Student {

    private String userName;
    private String userEmail;
    private int userAge;
    private boolean  enrolmentStatus = false;

    public static Student enroledStudent = new Student();

    public Student(String name, String email, int age) {
        this.userName = name;
        this.userEmail = email;
        this.userAge = age;
      //  this. enrolmentStatus = false;
    }

    public Student() {
        this.userName = "";
        this.userEmail = "";
        this.userAge = 0;
      //  this. enrolmentStatus = false;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public void setEmail(String email) {
        this.userEmail = email;
    }

    public void setAge(int age) {
        this.userAge = age;
    }

    public String getName() {
        return this.userName;
    }

    public String getAgeEmail() {
        return this.userEmail;
    }

    public int getAge() {
        return this.userAge;
    }
    public boolean  getEnrolmentStatus() {
        return this.enrolmentStatus;
    }

    public static boolean isValidEmail(String email) {

        return email.matches("^st[0-9]+@vcconnect\\.edu\\.za");
    }
    public static String checknrolementStatus(String email )
    {
       return  /*||*/ enroledStudent.getAgeEmail().equals(email) ?  " Student not found ": "Enrolment status for "+email+" :"+enroledStudent.getEnrolmentStatus(); 
     
    } 
    public void  enroleStudent()
    {
        enroledStudent = new Student(this.userName,this.userEmail,this.userAge);
        this.enrolmentStatus = true;
       
    } 

}
