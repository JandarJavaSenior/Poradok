package Pecaksoft.Service;

import Pecaksoft.Interface.MentorInterface;
import Pecaksoft.Model.Mentor;


public class MentorService  implements MentorInterface {
    private GroupService groupService;

    public MentorService(GroupService groupService) {
        this.groupService = groupService;
    }

    public GroupService getGroupService() {
        return groupService;
    }

    public void setGroupService(GroupService groupService) {
        this.groupService = groupService;
    }

    @Override
    public Mentor getMentorByName(String name) {
        return null;
    }

    @Override
    public Mentor[] getAllMentors() {
        return groupService.getPeaksoft().getMentor();
    }

    @Override
    public void deleteMentorById(int id) {


    }

    @Override
    public Mentor createMentor(Mentor mentor) {
        return null;
    }

    @Override
    public Mentor updateById(int id, Mentor mentor) {
        return null;
    }
}
