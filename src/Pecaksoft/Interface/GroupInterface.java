package Pecaksoft.Interface;

import Pecaksoft.Model.Group;
import Pecaksoft.Model.Student;

public interface GroupInterface {

    Group[] getAllGroups();
    Group getGroupByName(String name); void deleteGroupById(int id);
    String createGroup (Group group);
    Group updateById(int id, Group group);
    Group findById(int id);


}
