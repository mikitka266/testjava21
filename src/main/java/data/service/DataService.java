package data.service;

import data.User;

import java.util.List;

public interface DataService {
    void createUser(String firstName, String lastName, String patronymic);
    List<User> getAll();
    void deleteUser(String params);

    void deleteUser(Long id);
}
