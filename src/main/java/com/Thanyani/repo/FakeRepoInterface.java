package com.Thanyani.repo;


import com.Thanyani.user.Users;

public interface FakeRepoInterface {

    void removeUser(long id);

    void insertUser(Users user);

    void findUserById(long id);

}
