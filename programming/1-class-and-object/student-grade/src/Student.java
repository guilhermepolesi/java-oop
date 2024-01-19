public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double calculateGrade() {
        return grade1 + grade2 + grade3;
    }

    public void printApproval() {
        double grade = calculateGrade();
        if (grade >= 60.00) {
            System.out.printf("\nFINAL GRADE = %.2f\nPASS", grade);
        }
        else {
            double missing = 60.00 - grade;
            System.out.printf("\nFINAL GRADE = %.2f\nFAILED\nMISSING %.2f POINTS", grade, missing);
        }
    }

}
