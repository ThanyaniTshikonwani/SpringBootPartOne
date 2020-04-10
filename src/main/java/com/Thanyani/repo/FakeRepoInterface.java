package com.Thanyani.repo;


import com.Thanyani.user.User;

public interface FakeRepoInterface {
    void removeUser(long id);
    void insertUser(User user);
    void findUserById(long id);

}
