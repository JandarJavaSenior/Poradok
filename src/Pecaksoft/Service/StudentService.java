package Pecaksoft.Service;

import Pecaksoft.Interface.StudentInterface;
import Pecaksoft.Model.Peaksoft;
import Pecaksoft.Model.Student;

public class StudentService implements StudentInterface {
    private MentorService mentorService;


    public StudentService(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    public MentorService getMentorService() {
        return mentorService;
    }

    public void setMentorService(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    @Override
    public Student[] getAllStudents() {
        return new Student[0];
    }

    @Override
    public Student searchStudentByName(String name) {


        return null;
    }

    @Override
    public Student[] sortByStudentName(String ascDesc) {
        return new Student[0];
    }

    @Override
    public void deleteStudentById(int id) {

    }

    @Override
    public String createStudent(Student students) {
        return null;
    }

    @Override
    public Student updateById(int id, Student students) {
        return null;
    }

    @Override
    public Student findById(int id) {
        return null;
    }
}
