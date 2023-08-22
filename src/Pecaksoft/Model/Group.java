package Pecaksoft.Model;

public class Group {
    private  int id;
    private Pecaksoft.Enam.nameGrup nameGrup;
    private Student[]students;
    private int count;
    private int idd= 1;

    public Group(Pecaksoft.Enam.nameGrup nameGrup, Student[] students, int count) {
        this.nameGrup = nameGrup;
        this.students = students;
        this.count = count;
        this.id = idd++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pecaksoft.Enam.nameGrup getNameGrup() {
        return nameGrup;
    }

    public void setNameGrup(Pecaksoft.Enam.nameGrup nameGrup) {
        this.nameGrup = nameGrup;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }
}
