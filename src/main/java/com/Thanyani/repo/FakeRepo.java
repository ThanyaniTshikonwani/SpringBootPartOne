package com.Thanyani.repo;


import com.Thanyani.user.Users;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class FakeRepo implements FakeRepoInterface {


    private static Map<String, Users> fakeRepo = new HashMap<>();

    static {

        Users thanyani = new Users(1, "Thanyani", "Tshikonwani");
        fakeRepo.put(String.valueOf(thanyani.getId()), thanyani);

        Users olga = new Users(2, "Olga", "John");
        fakeRepo.put(String.valueOf(olga.getId()), olga);
    }

    @Override
    public void removeUser(long id) {

        fakeRepo.remove(id);
    }


    @Override
    public void insertUser(Users user) {

        fakeRepo.put(user.getId(), user);
    }

    @Override
    public void findUserById(long id) {
        fakeRepo.get(id);
    }

}
