package School.System;

/**
 * Keeps track of the student's
 * id, name, grade, feespaid, totalfees
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private double feesPaid;
    private double totalFees;

    /**
     *
     * @param id id of the student
     * @param name name of the student
     * @param grade grade of the student
     */
    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        feesPaid = 0;
        totalFees = 10000;
    }

    /**
     *
     * @param grade sets the grade of the student
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     *
     * @return returns the id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return returns the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return returns the grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return returns the feesPaid by the student
     */
    public double getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return returns the total fees of the student
     */
    public double getTotalFees() {
        return totalFees;
    }

    /**
     *
     * @param feesPaid updates the amount of fees paid
     */
    public void updateFeesPaid(double feesPaid){
    this.feesPaid += feesPaid;
    }

    /**
     * updates the total fees to be paid
     */
    public void updateTotalFees(){
        this.totalFees-=this.feesPaid;
    }
}
