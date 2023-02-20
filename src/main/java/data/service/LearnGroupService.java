package data.service;

import data.User;
import homework.LearnGroup;

import java.util.List;

public class LearnGroupService extends LearnGroup implements User{

    private final List <LearnGroup> LearnGroups;

    public LearnGroupService(List<LearnGroup> learnGroups) {
        super(firstName, lastName, patronymic);
        LearnGroups = learnGroups;
    }

/*
    public LearnGroupService(List<LearnGroup> learnGroups) {
        LearnGroups = learnGroups;
    }
    public LearnGroupService(List<data.Student> student) {
        Student = student;
    }


    @Override
    public void createGroup(List <Student> student, Teacher){
        Long id = 0L;
        for (Student item : student) {
            if (item instanceof Student) {
                if (id < ((Student) item).getStudentId()) {
                    id = ((Student) item).getStudentId();
                }
            }

        }
        this.users.add(new Student(firstName, lastName, patronymic, ++id));
    }

    @Override
    public List<User> getAll() {
        return null;
    }

*/

}


