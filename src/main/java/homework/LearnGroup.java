package homework;

import data.Student;
import data.Teacher;
import data.User;

import java.util.ArrayList;
import java.util.List;

public class LearnGroup {
    private Teacher teacher;
    private List<Student> studentsList;

    public LearnGroup(Teacher teacher, List<Student> studentsList){
        this.teacher = teacher;
        this.studentsList = studentsList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }
    @Override
    public String toString() {
        return "LearnGroup{" +
                "Teacher='" + teacher + '\'' +
                ", StudentList='" + studentsList + '\'' +
                '}';
    }
}



}
