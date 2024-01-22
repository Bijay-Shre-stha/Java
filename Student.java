class StudentClass {
    String name;
    int rollNo;
    int batch;
    String course;
    int[] marks;
    double percentage;

    void setInfo(String name, int rollNo, int batch, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.batch = batch;
        this.course = course;
    }

    void getTotalMarks() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println("Total marks of the student is: " + sum);
    }

    void calculatePercentage() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        percentage = ((double) sum / 500) * 100;
    }

    void getPercentage() {
        calculatePercentage();
        System.out.println("Percentage of the student is: " + percentage + "%");
    }

    void getDisplayDetails() {
        calculatePercentage(); // Calculate percentage before displaying details
        System.out.println("In examination " + name + ", " + rollNo + ", " + batch + ", " + course +
                ", got total marks " + calculateTotalMarks() + " out of 500 and achieved a percentage of " + percentage + "%");
    }

    int calculateTotalMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }
}

public class Student {
    public static void main(String[] args) {
        StudentClass[] students = new StudentClass[5];

        for (int i = 0; i < students.length; i++) {
            students[i] = new StudentClass();
            students[i].setInfo("Student" + (i + 1), i + 1, 2020+i, "B.Sc.CSIT");
            students[i].marks = new int[]{80, 85, 80, 90, 95}; 
            students[i].getDisplayDetails();
        }
    }
}
