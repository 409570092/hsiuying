package Student;

public abstract class Stu {
    String id;
    String name;
    int english;
    int math;

    public Stu() {
        super();
    }

    public Stu(String id, String name, int english, int math) {
        this.id = id;
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public void print() {
        System.out.println(id + "\t" + name + "\t" + english + "\t" + math + "\t" + (english+math)/2);
    }

    public abstract void mail();
}

