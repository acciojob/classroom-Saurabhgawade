package com.driver;

import java.util.HashMap;
import java.util.List;

public class StudentRepository {

    HashMap<String,Student>studentHashMap;
    HashMap<String,Teacher>teacherHashMap;

    HashMap<String,String>studentTeacherHashmap;


    public StudentRepository(){
        this.studentHashMap=new HashMap<>();
        this.teacherHashMap=new HashMap<>();
        this.studentTeacherHashmap=new HashMap<>();
    }

    public void addStudent(Student student){
        studentHashMap.put(student.getName(),student);
    }

    public void addTeacher(Teacher teacher){
        teacherHashMap.put(teacher.getName(),teacher);
    }

    public void addStudentTeacherPair(String student,String teacher){
        studentTeacherHashmap.put(student,teacher);
    }

    public void getStudentByName(String name,Student student) throws Exception{
        for(String nam:studentHashMap.keySet()){
            Student stu=studentHashMap.get(nam);
            if(nam.equals(name))
                student=stu;
        }
        throw new Exception("student not present");
    }

    public void getTeacherByName(String name,Teacher teacher)throws Exception{
        for(String nam:teacherHashMap.keySet()){
            Teacher tea=teacherHashMap.get(nam);
            if(nam.equals(name))
                teacher=tea;
        }
        throw new Exception("Teacher not present");
    }
    public void getStudentsByTeacherName(String teachername, List<String> ans){
        for(String stuname:studentTeacherHashmap.keySet()){
            String teaname=studentTeacherHashmap.get(stuname);
            if(teaname.equals(teachername)){
                ans.add(stuname);
            }
        }
    }


    public void getAllStudents(List<String>ans){
        for(String name:studentHashMap.keySet()){
            ans.add(name);
        }
    }

    public void deleteTeacherByName(String teaname){
        for(String name:teacherHashMap.keySet()){
            if(name.equals(teaname)){
                teacherHashMap.remove(name);
            }
        }
    }

    public void deleteAllTeachers(){
        for(String name:teacherHashMap.keySet()){
            teacherHashMap.remove(name);
        }
    }


}
