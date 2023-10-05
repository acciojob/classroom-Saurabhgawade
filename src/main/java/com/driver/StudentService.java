package com.driver;

import java.util.List;

public class StudentService {
    StudentRepository sr=new StudentRepository();

    public void addStudent(Student student){
        sr.addStudent(student);
    }
    public void addTeacher(Teacher teacher){
        sr.addTeacher(teacher);
    }

    public void addStudentTeacherPair(String student,String teacher){
        sr.addStudentTeacherPair(student,teacher);
    }
    public void getStudentByName(String name,Student student) throws Exception{
        if(name==null){
            throw new Exception("null value");
        }
       sr.getStudentByName(name,student);
    }

    public void getTeacherByName(String name,Teacher teacher)throws Exception{
        if(name==null){
            throw new Exception("null value");
        }
        sr.getTeacherByName(name,teacher);
    }

    public void getStudentsByTeacherName(String teachername, List<String>ans){
        sr.getStudentsByTeacherName(teachername, ans);
    }
    public void getAllStudents(List<String>ans){
        sr.getAllStudents(ans);
    }

    public void deleteTeacherByName(String teacher){
        sr.deleteTeacherByName(teacher);
    }
    public void deleteAllTeachers(){
        sr.deleteAllTeachers();
    }
}
