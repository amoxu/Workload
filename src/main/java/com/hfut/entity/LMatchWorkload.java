package com.hfut.entity;

public class LMatchWorkload extends LMatchWorkloadKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_match.type
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_match.level
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    private String level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_match.workload
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    private Float workload;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_match.note
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_match.type
     *
     * @return the value of local_match.type
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_match.type
     *
     * @param type the value for local_match.type
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_match.level
     *
     * @return the value of local_match.level
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public String getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_match.level
     *
     * @param level the value for local_match.level
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_match.workload
     *
     * @return the value of local_match.workload
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public Float getWorkload() {
        return workload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_match.workload
     *
     * @param workload the value for local_match.workload
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public void setWorkload(Float workload) {
        this.workload = workload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_match.note
     *
     * @return the value of local_match.note
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_match.note
     *
     * @param note the value for local_match.note
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}