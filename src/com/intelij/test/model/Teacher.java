package com.intelij.test.model;

public class Teacher {
    private Integer teacherId;
    private String teacherName;

    public Teacher(Integer teacherId, String teacherName) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;new Teacher(1,"vinil");
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    //for test im doing this...

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
