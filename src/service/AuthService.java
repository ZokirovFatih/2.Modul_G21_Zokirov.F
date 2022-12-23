package service;

import model.User;

import java.util.UUID;

public class AuthService {
    private static User[] userList=new User[100];
    private int index=0;

    public boolean addUser(
            String name,
            String userName,
            String password
    ){
        for (User user:userList) {
            if (user!=null){
                if (user.getUserName().equals(userName)){
                    return false;
                }
            }
        }
        userList[index++] = new User(name, userName, password);
        return true;
    }

    public User Login(
            String userName,
            String password
    ){
        for (User user:userList) {
            if (user!=null){
                if (
                        user.getUserName().equals(userName)
                            && user.getPassword().equals(password)
                ){
                    return user;
                }
            }
        }
        return null;
    }

    static User getUser(UUID userId){
        for (User user: userList) {
            if (user != null){
                if (user.getId().equals(userId)){
                    return user;
                }
            }
        }
        return null;
    }
}
