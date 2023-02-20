package data;

import data.controller.Controller;
import homework.LearnGroup;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createUser("Name", "Last Name", "Patronymic");
        controller.ShowLearnGroups();
        List< LearnGroup> learnGroups = controller.createTimetable(controller.createTeacher());
        controller.ShowLearnGroups(learnGroups);
        controller.showStudentAll("John Doe", "John Smith", "John Smith",);
    }
}