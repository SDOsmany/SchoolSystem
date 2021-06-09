package School.System;

/**
 * keeps track of the teacher's
 * id, name, salary
 */
public class Teacher {
    private int id;
    private String name;
    private double salary;

    /**
     *
     * @param id sets the teacher's id
     * @param name the name of the teacher
     * @param salary the salary of the teacher
     */
    public Teacher(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     * @param id sets the teacher's id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @param name sets the teacher's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param salary sets the teacher's salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     *
     * @return returns the teacher's id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return returns the teacher's name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return returns the teacher's salary
     */
    public double getSalary() {
        return salary;
    }
}
