
import javax.swing.JOptionPane;

public class TutorialDemo {

    public static void main(String[] args) {
         /* String strName = JOptionPane.showInputDialog("Enter student name");
        String strEmail = JOptionPane.showInputDialog("Enter student Email");
        while (!Student.isValidEmail(strEmail)) {
            JOptionPane.showMessageDialog(null, "Invalid Email");
            strEmail = JOptionPane.showInputDialog("please enter a valid student Email");
        }
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter student Age"));
        while (age < 18) {
            JOptionPane.showMessageDialog(null, "Invalid Age");
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter a valid Age"));

        }*/
        
        Student newStudent = new Student("james", "st123@vcconnect.edu.za", 26);
        // Student newStudent = new Student(strName, strEmail, age);

        int enroleOption = JOptionPane.showConfirmDialog(null, "do you wish to enlole the student?");

        if (enroleOption == 0) {
            newStudent.enroleStudent();
        }

        int checkStatusOption = JOptionPane.showConfirmDialog(null, "do check a student's enrolment status?");
       
        if (checkStatusOption == 0) {
            String checkEmail = JOptionPane.showInputDialog("Enter the student's email");
            JOptionPane.showMessageDialog(null,(Student.checknrolementStatus(checkEmail)));
        }
      
        switch (enroleOption) {
            case 1:
            newStudent.enroleStudent();
         

                break;
            default:
                throw new AssertionError();
        } 

    }
}
