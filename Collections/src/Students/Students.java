package Students;

public class Students {

    private String name;
    private int mark;

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public Students(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
