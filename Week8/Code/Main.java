package Week8;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] grades = {88,99,55,66};
//            int sum = 0;
//
//        for (int i = 0 ; i < grades.length ; i++){
//            sum += grades[i];
//        }
//
//        sum = 0;
//        for(int currentGrade : grades){
//           sum += currentGrade;
//        }


        // DEPARTMENTS QUESTION

        final int NUMBER_OF_DEPARTMENTS = 3;
        double[][] companySalaries = new double[NUMBER_OF_DEPARTMENTS][];

        for (int depIndex = 0; depIndex < companySalaries.length; depIndex++) {
            String question1 = "HOW MANY EMP'S IN DEP#"+ (depIndex+1);
            int numOfEmps = Integer.parseInt(JOptionPane.showInputDialog(null,question1));
            companySalaries[depIndex] = new double[numOfEmps];

            for (int empIndex = 0; empIndex < companySalaries[depIndex].length; empIndex++) {
                String question2 = "ENTER SALARY FOR EMP#"+ (empIndex+1);
                double salaryForCurrentEmp = Double.parseDouble(JOptionPane.showInputDialog(null,question2));
                companySalaries[depIndex][empIndex] = salaryForCurrentEmp;
            }
        }

        
        // AVG FOR EACH DEP + COMPANY
        
        int[] depSum = new int[NUMBER_OF_DEPARTMENTS]; // MULTIPLE DEPARTMENTS
        int companySum = 0;
        double avg = 0;

        double maxSalary = companySalaries[0][0];
        int numberOfAllEmps = 0;

        for (int i = 0; i < companySalaries.length; i++) {
            for (int j = 0; j < companySalaries[i].length; j++) {
                numberOfAllEmps += companySalaries[i].length;
                double currentSalary = companySalaries[i][j];
                depSum[i] += currentSalary;
                companySum += currentSalary;
                if(currentSalary > maxSalary) maxSalary = companySalaries[i][j];
            }
        }




    }

}
