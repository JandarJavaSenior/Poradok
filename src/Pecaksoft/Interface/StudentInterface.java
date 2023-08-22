package Pecaksoft.Interface;

import Pecaksoft.Model.Student;

public interface StudentInterface {

    Student[] getAllStudents();

    Student searchStudentByName(String name);

    Student[] sortByStudentName (String ascDesc); void deleteStudentById(int id);

    String createStudent (Student students);

    Student updateById(int id, Student students);

    Student findById(int id);
}
