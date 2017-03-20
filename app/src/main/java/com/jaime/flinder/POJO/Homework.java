package com.jaime.flinder.POJO;

/**
 * Created by jaime on 05/01/2017.
 */

public class Homework {
    private Subject subject;
    private String description;
    private String deadlineDate;

    public Homework(Subject subject, String description, String deadlineDate) {
        this.subject = subject;
        this.description = description;
        this.deadlineDate = deadlineDate;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }
}
