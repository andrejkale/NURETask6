package employee;

public class Engineer implements Employee {
   private String speciality;
   private double salary;
   private double workExperience;
   private boolean inVacation;

    public Engineer(String speciality, double salary, double workExperience, boolean inVacation) {
        this.speciality = speciality;
        this.salary = salary;
        this.workExperience = workExperience;
        this.inVacation = inVacation;
    }

    @Override
    public String getSpeciality() {
        return speciality;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public double getWorkExperience() {
        return workExperience;
    }

    @Override
    public boolean getInVacation() {
        return inVacation;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "speciality='" + speciality + '\'' +
                ", salary=" + salary +
                ", workExperience=" + workExperience +
                ", inVacation=" + inVacation +
                '}';
    }

    public static void printEngineer(Engineer engineer){
        System.out.println(engineer);
    }
}
