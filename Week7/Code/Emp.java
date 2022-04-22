package Week7;

import javax.swing.*;

public class Emp {
    public static void main(String[] args) {

        final int SIZE = 10;
        int[][] companySalaries = new int[SIZE][]; // 10 Departments

        int sumCompany = 0;
        int[] sumDep = new int[companySalaries.length];

        int numberOfEmployeesWithMidRangeSalary = 0;

        for (int i = 0; i < companySalaries.length; i++) { // DEPARTMENTS
            int numberOfEmployeesInDep = Integer.parseInt(JOptionPane.showInputDialog("HOW MANY EMPLOYEES IN DEPARTMENT #"+ (i+1)));
            companySalaries[i] = new int[numberOfEmployeesInDep];
            for (int empID = 0; empID < companySalaries[i].length; empID++) { // EMPLOYEES INSIDE EACH DEPARTMENT
                String msg = "Enter The Salary for EMP #"+ (empID+1) + " IN DEP #" + (i+1);
                companySalaries[i][empID] = Integer.parseInt(JOptionPane.showInputDialog(msg));
                sumDep[i] += companySalaries[i][empID]; // SUM FOR EACH DEP
                if(companySalaries[i][empID] >= 600 && companySalaries[i][empID] <= 1400) numberOfEmployeesWithMidRangeSalary++;
            }
            sumCompany += sumDep[i];
            JOptionPane.showMessageDialog(null, "DEP #" + (i+1) + " IS DONE");
        }


        for (int i = 0; i < sumDep.length; i++) {
            System.out.print(sumDep[i] + " --- " + companySalaries[i].length);
            System.out.println(" -- AVG FOR EACH DEP:" + (sumDep[i]/companySalaries[i].length));
        }

        int numberOfAllEmps = 0;

        for (int i = 0; i < companySalaries.length; i++) {
            numberOfAllEmps += companySalaries[i].length;
        }

        System.out.println(sumCompany/numberOfAllEmps);

        for (int i = 0; i < companySalaries[2].length; i++) {
            System.out.println(companySalaries[2][i]);
        }

        int[] flatSalaries = new int[numberOfAllEmps];

        int counter = 0;

        for (int i = 0; i < companySalaries.length; i++) {
            for (int j = 0; j < companySalaries[i].length; j++) {
                flatSalaries[counter++] = companySalaries[i][j];
            }
        }
        

        }



}
