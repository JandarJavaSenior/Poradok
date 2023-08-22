package Pecaksoft.Model;

import java.util.Arrays;

public class Peaksoft {
    private String name;
    private String address;
    private Mentor[] mentor;
    private Group[] group;
    private Student[][]students;

    public Peaksoft(String name, String address, Mentor[] mentor, Group[] group, Student[][] students) {
        this.name = name;
        this.address = address;
        this.mentor = mentor;
        this.group = group;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Mentor[] getMentor() {
        return mentor;
    }

    public void setMentor(Mentor[] mentor) {
        this.mentor = mentor;
    }

    public Group[] getGroup() {
        return group;
    }

    public void setGroup(Group[] group) {
        this.group = group;
    }

    public Student[][] getStudents() {
        return students;
    }

    public void setStudents(Student[][] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Peaksoft {\n");
        sb.append("  name: ").append(name).append('\n');
        sb.append("  address: ").append(address).append('\n');
        sb.append("  mentor: ").append(Arrays.toString(mentor)).append('\n');
        sb.append("  group: ").append(Arrays.toString(group)).append('\n');
        sb.append("  students: ").append(Arrays.toString(students)).append('\n');
        sb.append("}");
        return sb.toString();
    }

}
