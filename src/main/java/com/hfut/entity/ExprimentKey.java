package com.hfut.entity;

public class ExprimentKey {
    private Integer id;

    private String teacher;

    private String lesson;

    private Integer years;

    private Integer teachClass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson == null ? null : lesson.trim();
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public Integer getTeachClass() {
        return teachClass;
    }

    public void setTeachClass(Integer teachClass) {
        this.teachClass = teachClass;
    }
}