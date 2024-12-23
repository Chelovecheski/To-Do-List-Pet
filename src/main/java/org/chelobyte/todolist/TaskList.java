package org.chelobyte.todolist;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> taskList = new ArrayList<>();

    public void addTask(String task) {
        taskList.add(task);
    }

    public void removeTask(int taskNumber) {
        taskList.remove(taskNumber);
    }

    public List<String> getTaskList() {
        return taskList;
    }

}
