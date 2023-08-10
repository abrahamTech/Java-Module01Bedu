package Session06.Example02.myCode09082023;

public class Teacher extends Person{
    private String teacherId;

    public Teacher(String name, String lastName, String teacherId) {
        super(name, lastName);
        this.teacherId = teacherId;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Teacher(id: " + teacherId + ")");
    }
}
