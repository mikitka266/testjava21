package view;

import data.Student;
import data.User;
import homework.LearnGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudentView {
    public void sendOnConsole(List<User> users){
        Logger logger = Logger.getAnonymousLogger();

        for (User user : users){
            logger.info(user.toString());
        }
    }
    public void showLearnGroups(List<LearnGroup> learnGroups){
        Logger logger = Logger.getAnonymousLogger();

        for (LearnGroup group : learnGroups){
            logger.info(group.toString());
        }
    }
    public void showStudents(List<Student> learnGroups){
        Logger logger = Logger.getAnonymousLogger();

        for (Student group : learnGroups){
            logger.info(group.toString());
        }
    }
    public static void showStudentAll(List<Student> studentList){
        Logger logger = Logger.getAnonymousLogger();

        for (Student student : studentList){
            logger.info(student.toString());
        }
    }

}
