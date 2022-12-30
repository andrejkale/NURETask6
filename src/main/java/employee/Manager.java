package employee;

public class Manager extends Engineer {
    private boolean isManager;

    public Manager(String speciality, double salary, double workExperience, boolean inVacation) {
        super(speciality, salary, workExperience, inVacation);
        this.isManager = true;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    @Override
    public String getSpeciality() {
        return super.getSpeciality();
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public double getWorkExperience() {
        return super.getWorkExperience();
    }

    @Override
    public boolean getInVacation() {
        return super.getInVacation();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "isManager=" + isManager +
                '}';
    }

    public static void printManager(Manager manager){
        System.out.println(manager + " speciality='" + manager.getSpeciality() + '\''
                + ", salary=" + manager.getSalary()
                + ", workExperience=" + manager.getWorkExperience()
                + ", inVacation=" + manager.getInVacation()
                );
    }
}
