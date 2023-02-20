package data.service;

import data.Student;
import data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService{
    private List <User> users;

    public UserService(List<User> users) {
        this.users = new ArrayList<>();
    }

    @Override
    public void createUser(String firstName, String lastName, String patronymic)) {
    Long id = 0L;
    for (User item : this.users) {
        if (item instanceof Student) {
            if (id< ((Student) item).getStudentId()){
                id = ((Student) item).getStudentId();
            }
        }

    }
    this.users.add(new Student(firstName, lastName, patronymic,++id));


    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void deleteUser(Long id) {
    for (User item: this.users){
        if (item instanceof Student) {
            if (id.equals(((Student) item).getStudentId())){
                users.remove(item);
            }
        }
    }

    }
}
