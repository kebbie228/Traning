package Generic.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Dima", 13);
        Schoolar schoolar2 = new Schoolar("Ama", 13);

        Student student1 = new Student("Gena", 33);
        Student student2 = new Student("Gena", 23);

        Employee employee1 = new Employee("Ant", 45);
        Employee employee2 = new Employee("Bug", 65);

        Team<Schoolar> sch = new Team<>("SCH");
        sch.addNewParticipant(schoolar1);
        sch.addNewParticipant(schoolar2);

        Team<Student> std = new Team<>("STD");
        std.addNewParticipant(student1);
        std.addNewParticipant(student2);


        Team<Student> std2 = new Team<>("STD2");
        std2.addNewParticipant(student1);
        std2.addNewParticipant(student2);

        Team<Employee> emp = new Team<>("EMP");
        emp.addNewParticipant(employee1);
        emp.addNewParticipant(employee2);

        std.playWith(std2);

    }
}
