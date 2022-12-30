package abiturient;

public abstract class Student implements Abiturient {
    String name;
    String secondName;
    boolean isCorrespondenceStudent;

    public Student(String name, String secondName, boolean isCorrespondenceStudent) {
        this.name = name;
        this.secondName = secondName;
        this.isCorrespondenceStudent = isCorrespondenceStudent;
    }

    public Student(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }
}
