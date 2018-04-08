package lab2;

public class Postgraduate extends Student {
    private String tutor;
    private String researchArea;

    public Postgraduate(String name, int NO, String tutor, String area) {
        // TODO
    }

    protected void calcAverScore() {
        // 标准算法GPA (各科成绩按学分的加权平均数 * 4 / 100)
        // TODO
    }

    public void printReport() {
        // TODO
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

}
