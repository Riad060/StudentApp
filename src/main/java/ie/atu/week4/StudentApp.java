package ie.atu.week4;

public class StudentApp {
    public static void main(String[] args){
        Student firstStudent = new Student();
        firstStudent.setName("Paul");
        firstStudent.setEmail("Paul@atu.ie");
        firstStudent.setCourse("Engineering");

        System.out.println(firstStudent.toString());

        Student secondStudent = new Student("Dave");
        Student thirdStudent = new Student("Bear","bear@atu.ie","medicine");

    }
}
