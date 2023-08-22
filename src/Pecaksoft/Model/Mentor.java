package Pecaksoft.Model;

import Pecaksoft.Enam.Gender;

public class Mentor {
    private int id;
    private String nameMentor;
    private Gender gender;
    private String email;
    private Group group;
    private int idd;


    public Mentor(String nameMentor, Gender gender, String email, Group group) {
        this.nameMentor = nameMentor;
        this.gender = gender;
        this.email = email;
        this.group = group;
        this.id = idd++;

    }

    public String getNameMentor() {
        return nameMentor;
    }

    public void setNameMentor(String nameMentor) {
        this.nameMentor = nameMentor;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
