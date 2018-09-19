
public class StudentManagement
{
    public ArrayList<Student> std = new ArrayList<Student>(100);
    public void removeStudent(String id)
    {
        for (int i = 0; i < std.size(); i++)
        {
            Student stud = std.get(i);
            if (stud.getId().equals(id))
                std.remove(i);
        }
    }



    public boolean sameGroup(Student s1, Student s2)
    {
        return s1.getGroup().equals(s2.getGroup());
    }

    public static void main(String[] args)
    {
        Student st1 = new Student();
        st1.setName("Nguyen Tien Duc");
        st1.setId("17020698");
        st1.setGroup("INT22041");
        st1.setEmail("nguyentienduc02061999@gmail.com");
        System.out.println("Name: " + st1.getName());
        System.out.println("Thong tin: " + st1.getInfo());

        Student st2 = new Student();
        System.out.println(st2.getInfo());
        Student st3 = new Student("Tien dUC", "17012345", "tienduc02061999@gmail.com");
        System.out.println(st3.getInfo());
        Student st4 = new Student(st3);
        System.out.println(st4.getInfo());
        StudentManagement sm = new StudentManagement();
        System.out.println(sm.sameGroup(st1, st2));
    }
}
