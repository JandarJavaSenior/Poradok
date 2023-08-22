package Pecaksoft;

import Pecaksoft.Enam.Gender;
import Pecaksoft.Enam.nameGrup;
import Pecaksoft.Model.Group;
import Pecaksoft.Model.Mentor;
import Pecaksoft.Model.Peaksoft;
import Pecaksoft.Model.Student;
import Pecaksoft.Service.GroupService;
import Pecaksoft.Service.MentorService;
import Pecaksoft.Service.StudentService;

import javax.management.monitor.GaugeMonitor;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Jandar", Gender.MALE,"x@gmail.com");
        Student student1 = new Student("Erkin", Gender.MALE,"x@gmail.com");
        Student[] studentsjava1 = {student,student1};
        Group group = new Group(nameGrup.java1,studentsjava1, studentsjava1.length);

        Student student2 = new Student("Nurlis", Gender.MALE,"x@gmail.com");
        Student student3 = new Student("Boyka", Gender.MALE,"x@gmail.com");
        Student[] studentsjava2 = {student2,student3};
        Group group1 = new Group(nameGrup.java2,studentsjava2, studentsjava1.length);

        Student student4 = new Student("Jan Clod Vandam", Gender.MALE,"x@gmail.com");
        Student student5 = new Student("Bruce Lee", Gender.MALE,"x@gmail.com");
        Student[] studentsjava3 = {student4,student5};
        Group group2 = new Group(nameGrup.java3,studentsjava3, studentsjava1.length);
        Student [][] students = {studentsjava1,studentsjava2,studentsjava3};


        Mentor mentor = new Mentor("Ainazik",Gender.FEMALE,"aina@gmail.com",group);
        Mentor mentor1 = new Mentor("Davran",Gender.MALE,"aina@gmail.com",group1);
        Mentor mentor2 = new Mentor("Dgeki Chan",Gender.FEMALE,"aina@gmail.com",group2);
        Mentor[] mentors = {mentor,mentor1,mentor2};
        Group [] groups={group,group1,group2};

        Peaksoft peaksoft = new Peaksoft("Pikspft","vostok 5",mentors,groups,students);
        GroupService gaugeMonitor = new GroupService(peaksoft);
        MentorService mentorService = new MentorService(gaugeMonitor);
        StudentService studentService = new StudentService(mentorService);
        studentService.deleteStudentById(1);
    }
}
