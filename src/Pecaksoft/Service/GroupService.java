package Pecaksoft.Service;

import Pecaksoft.Interface.GroupInterface;
import Pecaksoft.Model.Group;
import Pecaksoft.Model.Peaksoft;

public class GroupService implements GroupInterface{
    private  Peaksoft peaksoft;

    public GroupService(Peaksoft peaksoft) {
        this.peaksoft = peaksoft;
    }

    public Peaksoft getPeaksoft() {
        return peaksoft;
    }

    public void setPeaksoft(Peaksoft peaksoft) {
        this.peaksoft = peaksoft;
    }

    @Override
    public Group[] getAllGroups() {
        return new Group[0];
    }

    @Override
    public Group getGroupByName(String name) {
        return null;
    }

    @Override
    public void deleteGroupById(int id) {

    }

    @Override
    public String createGroup(Group group) {
        return null;
    }

    @Override
    public Group updateById(int id, Group group) {
        return null;
    }

    @Override
    public Group findById(int id) {
        return null;
    }
}
