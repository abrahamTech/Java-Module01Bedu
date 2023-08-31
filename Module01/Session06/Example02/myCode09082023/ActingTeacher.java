package Session06.Example02.myCode09082023;

public class ActingTeacher extends Teacher{
    private String terminationDate;

    public ActingTeacher(String name, String lastName, String teacherId, String terminationDate) {
        super(name, lastName, teacherId);
        this.terminationDate = terminationDate;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Acting Teacher: (Termination Date: " + terminationDate + ")");
    }
}
