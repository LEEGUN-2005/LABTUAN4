public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nguyen Van Phep", "123 Le Van Sy");
        System.out.println(person);

        Student student = new Student("Nguyen Thi No", "456 Cong Hoa", "Computer Science", 2, 5000.0);
        System.out.println(student);

        Staff staff = new Staff("Anh Huynh", "789 Cao Thang", "Tech University", 60000.0);
        System.out.println(staff);
    }
}
