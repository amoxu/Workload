package com.hfut.entity;

public class LProjectWorkload extends LProjectWorkloadKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_project.name
     *
     * @mbggenerated Sat Oct 28 21:14:11 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_project.type
     *
     * @mbggenerated Sat Oct 28 21:14:11 CST 2017
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_project.level
     *
     * @mbggenerated Sat Oct 28 21:14:11 CST 2017
     */
    private String level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_project.workload
     *
     * @mbggenerated Sat Oct 28 21:14:11 CST 2017
     */
    private Float workload;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_project.note
     *
     * @mbggenerated Sat Oct 28 21:14:11 CST 2017
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_project.name
     *
     * @return the value of local_project.name
     *
     * @mbggenerated Sat Oct 28 21:14:11 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_project.name
     *
     * @param name the value for local_project.name
     *
     * @mbggenerated Sat Oct 28 21:14:11 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_project.type
     *
     * @return the value of local_project.type
     *
     * @mbggenerated Sat Oct 28 21:14:11 CST 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_project.type
     *
     * @param type the value for local_project.type
     *
     * @mbggenerated Sat Oct 28 21:14:11 CST 2017
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_project.level
     *
     * @return the value of local_project.level
     *
     * @mbggenerated Sat Oct 28 21:14:11 CST 2017
     */
    public String getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_project.level
     *
     * @param level the value for local_project.level
     *
     * @mbggenerated Sat Oct 28 21:14:11 CST 2017
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_project.workload
     *
     * @return the value of local_project.workload
     *
     * @mbggenerated Sat Oct 28 21:14:11 CST 2017
     */
    public Float getWorkload() {
        return workload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_project.workload
     *
     * @param workload the value for local_project.workload
     *
     * @mbggenerated Sat Oct 28 21:14:11 CST 2017
     */
    public void setWorkload(Float workload) {
        this.workload = workload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_project.note
     *
     * @return the value of local_project.note
     *
     * @mbggenerated Sat Oct 28 21:14:11 CST 2017
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_project.note
     *
     * @param note the value for local_project.note
     *
     * @mbggenerated Sat Oct 28 21:14:11 CST 2017
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}