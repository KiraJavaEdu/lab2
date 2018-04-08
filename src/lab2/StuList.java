package lab2;

public class StuList implements StuListInterface {
    private Student[] stus;
    private int length;   // the actual number of student it contains
    private static final int DEFAULT_CAPACITY = 15;   // default initial capacity

    public StuList() {
        //this(DEFAULT_CAPACITY);
        stus = new Student[DEFAULT_CAPACITY];
        this.length = 0;
    }

    public StuList(int len) {
        stus = new Student[len];
        this.length = 0;
    }

    // TODO, you should  implements the StuListInterface here
    // You can reuse you code in lab1

}
