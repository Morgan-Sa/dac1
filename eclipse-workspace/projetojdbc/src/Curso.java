public class Curso {
    private Number id;
    private String name;
    private String nameTeacher;
    private Number courseHours;

    public Curso(Number id, String name, String nameTeacher, Number courseHours) {
        this.id = id;
        this.name = name;
        this.nameTeacher = nameTeacher;
        this.courseHours = courseHours;
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public Number getCourseHours() {
        return courseHours;
    }

    public void setCourseHours(Number courseHours) {
        this.courseHours = courseHours;
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", name=" + name + ", nameTeacher=" + nameTeacher + ", courseHours=" + courseHours + "]";
    }
}
