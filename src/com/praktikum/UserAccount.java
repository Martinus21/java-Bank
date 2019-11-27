package com.praktikum;

import java.util.ArrayList;

// This POJO (Plain Old Java Object)
// POJO (SISTEM LOGIN)
class UserAccount{
    private ArrayList<UserAccount> DataUser = new ArrayList<UserAccount>();
    private String username;
    private String password;

    UserAccount(){}
    UserAccount(String acc_User, String acc_Password){
        this.username = acc_User;
        this.password = acc_Password;
    }

    public boolean logUser(String username, String password) {
        if(DataUser.size() < 1) {
            System.out.println("Data Kosong");
        }else{
            for(UserAccount check: DataUser) {
                if(check.getUserName().equals(username) && check.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean regUser(String username, String password) {
        UserAccount tmpUser = new UserAccount(username, password);
        DataUser.add(tmpUser);
        return logUser(username, password);
    }

    public void getUsers() {
        if(DataUser.size() < 1) {
            System.out.println("Data Kosong");
        } else {
            for (UserAccount check: DataUser) {
                System.out.println("Username : " + check.getUserName());
            }
            System.out.println();
        }
    }

    // SET GET USERNAME
    public void setUserName(String acc_User){
        this.username = acc_User;
    }
    public String getUserName(){
        return username;
    }

    // SET GET PASSWORD
    public void setPassword(String acc_Password){
        this.password = acc_Password;
    }
    public String getPassword(){
        return password;
    }
}