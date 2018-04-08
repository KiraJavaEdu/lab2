package lab2;

public class Student {
    private String name;
    private int id;  // 根据各位同学在lab1中指出的问题，全大写字母一般表示常量，此处做出调整，使用id表示学号
    private double averScore;

    // private Course report;
    private CourseScore report;

    protected Student() {
        // TODO, please use just one line code
        // you can reuse your code in lab1
    }

    protected Student(String name, int id) {
        // TODO, you can reuse your code in lab1, pay attention to CourseScore
    }

    // protected abstract void calcAverScore();

    // protected abstract void printReport();

    public void setAverScore(double averScore) {
        this.averScore = averScore;
    }

    public CourseScore getReport() {
        return report;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getAverScore() {
        // TODO, you can reuse your code in lab1
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNO(int id) {
        this.id = id;
    }

    public boolean addCourse(Course course, double score) {
        // TODO, you can reuse your code in lab1, pay attention to CourseScore
    }

    public boolean delCourse(String NO) {
        // TODO, you can reuse your code in lab1, pay attention to CourseScore
    }

    public boolean updateCourse(String NO, double score) {
        // TODO, you can reuse your code in lab1, pay attention to CourseScore
    }

    public void printReport(String NO) {
        // TODO, you can reuse your code in lab1, pay attention to CourseScore
    }


}
