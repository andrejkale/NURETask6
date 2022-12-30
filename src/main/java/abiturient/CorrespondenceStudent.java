package abiturient;

public class CorrespondenceStudent extends Student {

    private CorrespondenceStudent(String name, String secondName, boolean studentType) {
        super(name, secondName, studentType);
    }

    public CorrespondenceStudent(String name, String secondName) {
        this(name, secondName, true);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSecondName() {
        return this.secondName;
    }

    @Override
    public boolean getType() {
        return this.isCorrespondenceStudent;
    }

    public static void printStudent(Student student) {
        System.out.println(student);
    }

    @Override
    public String toString() {
        return "CorrespondenceStudent{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", isCorrespondenceStudent=" + isCorrespondenceStudent +
                '}';
    }
}
