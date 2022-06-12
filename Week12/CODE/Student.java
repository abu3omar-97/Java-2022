package Week12;

public class Student {
    // WHAT IT HAS?
    public int id;
    public String firstName;
    public String middleName;
    public String lastName;
    public int dateOfBirth;
    public String[] courses;
    public double gpa;

// getFullName
    public String getFullName(){
        return this.firstName + " " + this.middleName + " " + this.lastName;
    }

// setFullName
    public void setFullName(String firstName, String middleName, String lastName){
        if(firstName.length() < 3) return;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

// printStudentInfo
// getAge
    public int getAge(){
        return 2022 - this.dateOfBirth; // TODO: GET DATE FROM SYSTEM
    }

// convertMarkToChar
    public char convertMarkToChar(){
        if(this.gpa >= 90) return 'A';
        if(this.gpa >= 80) return 'B';
        return 'F';
    }


}
