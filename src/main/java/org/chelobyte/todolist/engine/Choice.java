package org.chelobyte.todolist.engine;

import org.chelobyte.todolist.TaskList;

import java.util.NoSuchElementException;

public class Choice {

    private final TaskList taskList;

    public Choice(TaskList taskList) {
        this.taskList = taskList;
    }

    public void choose() {

        Printer.printMenu();

        while (true) {
            try {
                byte choice = Byte.parseByte(Input.getString());

                switch (choice) {
                    case 1 -> addTask();
                    case 2 -> removeTask();
                    case 3 -> showTasks();
                    default -> throw new NoSuchElementException();
                }
            } catch (Exception e) {
                Printer.printNoSuchElementException();
                choose();
            }

            break;
        }

    }

    private void addTask() {

        Printer.printTypeYourTask();

        String task = Input.getString();
        this.taskList.addTask(task);

        Printer.printTaskAdded();

    }

    private void removeTask() {

        Printer.printTypeNumberOfTask();

        try {
            int taskNumber = Integer.parseInt(Input.getString()) - 1;
            this.taskList.removeTask(taskNumber);
            Printer.printTaskRemoved();
        } catch (Exception e) {
            Printer.printTaskNotFoundException();
        }

    }

    private void showTasks() {

        if (this.taskList.getTaskList().size() == 1) {
            Printer.printOneYourTask();
            System.out.println("1. " + this.taskList.getTaskList().get(0));
        } else if (!this.taskList.getTaskList().isEmpty()) {
            Printer.printAllYourTasks();
            for (int i = 0; i < this.taskList.getTaskList().size(); i++) {
                System.out.println(i + 1 + ". " + this.taskList.getTaskList().get(i));
            }
        }
        else {
            Printer.printListIsEmpty();
        }


    }

}
