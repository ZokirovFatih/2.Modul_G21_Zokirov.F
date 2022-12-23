package service;

import model.Group;
import model.User;

public class GroupService {
    private Group[] groupList=new Group[100];

    private int index=0;

    public boolean addGroup(User currentStudent, User GroupStudent) {
        boolean isTrue = checkGroup(currentStudent, GroupStudent);
        if (isTrue) {
            return false;
        }
        groupList[index++] = new Group(currentStudent.getId(), GroupStudent.getId());
        return true;
    }

    public User[] getGroupList(User currentUser) {
        int cnt = 0;
        for (Group group : groupList) {
            if (group != null) {
                if (group.getTicherId().equals(currentUser.getId())) {
                        cnt++;
                }
            }
        }
        return this.fillUserFromGroupList(new User[cnt], currentUser);
    }

    private User[] fillUserFromGroupList(User[] users, User currentUser) {
        int index = 0;
        for (Group group : groupList) {
            if (group != null) {
                    if (group.getTicherId().equals(currentUser.getId())) {
                        users[index ++] = AuthService.getUser(group.getStudentId());
                    }
            }
        }
        return users;
    }

    private boolean checkGroup(User currentStudent, User groupStudent) {
        for (Group group : groupList) {
            if (group != null) {
                if (
                        group.getTicherId().equals(currentStudent.getId())
                                && group.getStudentId().equals(groupStudent.getId())
                ) {
                    return true;
                }
            }
        }
        return false;
    }
}
