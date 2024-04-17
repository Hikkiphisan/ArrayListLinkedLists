public class Student {
    private int id;
    private String name;
    private String email;
    private double GPA;


    public Student(int id, String name, String email, double GPA) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getGPA() {
        return GPA;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
