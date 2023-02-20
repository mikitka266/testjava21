package data.controller;

import data.*;
import data.service.LearnGroupService;
import data.service.UserService;
import homework.LearnGroup;
import view.StudentView;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();

    public void createUser (String firstName, String lastName, String patronymic){
        userService.createUser(firstName, lastName, patronymic);
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }

    public List <LearnGroup> createTimetable(Teacher teacher, List<Student> studentList){
        return learnGroupService.completeLearnGroup(teacher, studentList);
    }
    public void ShowLearnGroups(List <LearnGroup> learnGroup){
        studentView.showLearnGroups(learnGroup);
    }
    public void ShowSortedLearnGroup(List <Student> studentList){
        Collections.sort(studentList, new LearnGroupComparator());
        StudentView.showStudents(studentList);
    }
    public void showStudentAll(List <Student> studentList){
        Collections.sort(studentList, new StudentComparator());
        StudentView.showStudentAll(studentList);
    }




}
