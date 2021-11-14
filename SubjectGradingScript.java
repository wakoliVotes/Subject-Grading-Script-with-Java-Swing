// This script is on an exam grading system using Graphical User Interface (GUI)
// The concept is that based on attained marks, students are given their specific grades

/* The grading is based on the system below;
70 - 100    A - Excellent
65 - 69     B - Very Good
60 - 64     C - Good
55 - 59     D - Credit
40 - 54     E - Pass
39 & below  F - Fail

*/
// The script accepts double entries, with users able to enter whole and decimal values for marks
// Examples includes 20, 34, 56.8, 86.88, 99.98 and 23
import javax.swing.*;

class SubjectGradingScript {
    public static void main(String[] args) {
        String examResult;

        examResult = JOptionPane.showInputDialog(null, "Enter Marks Attained in Subject's Exam");
        // Conditional [if...else if...else] statements for various grading
        try {
            if (Double.parseDouble(examResult) > 100) {
                JOptionPane.showMessageDialog(null, "Enter Marks in the Range 0 to 100", "Warning Message, Bad Range", JOptionPane.WARNING_MESSAGE);
            } else if (Double.parseDouble(examResult) > 70) {
                JOptionPane.showMessageDialog(null, examResult + ": A - Excellent");
            } else if (Double.parseDouble(examResult) > 65) {
                JOptionPane.showMessageDialog(null, examResult +  ": B - Very Good");
            } else if (Double.parseDouble(examResult) > 60) {
                JOptionPane.showMessageDialog(null, examResult +  ": C - Good");
            } else if (Double.parseDouble(examResult) > 55) {
                JOptionPane.showMessageDialog(null, examResult + ": D - Credit");
            } else if (Double.parseDouble(examResult) > 40) {
                JOptionPane.showMessageDialog(null, examResult + ": E - Pass");
            } else if (Double.parseDouble(examResult) > 0) {
                JOptionPane.showMessageDialog(null, examResult + ": F - Fail");
            } else {
                JOptionPane.showMessageDialog(null, "Error: You Entered Wrong Marks to Generate Results", "ERROR in Message Passing", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Error: Please Enter Only Numbers, not Strings", "WRONG FORMAT PASSED", JOptionPane.ERROR_MESSAGE);
        }
        // Close the System
        System.exit(0);
    }
}