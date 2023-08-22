package Pecaksoft.Interface;
import Pecaksoft.Model.Mentor;

public interface MentorInterface {


    Mentor getMentorByName(String name);
    Mentor[] getAllMentors();
    void deleteMentorById(int id);
    Mentor createMentor (Mentor mentor);
    Mentor updateById (int id, Mentor mentor);



}
