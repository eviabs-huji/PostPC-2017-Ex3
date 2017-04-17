package evia.huji.ac.il.ex3;

import java.util.Date;

public class Task {

    private String task;
    private Date dueDate;

    public Task(String task, Date date) {
        this.task = task;
        this.dueDate = date;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getTaskText() {
        return this.task;
    }

    public void setTaskText(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "#" + this.task;
    }
}
