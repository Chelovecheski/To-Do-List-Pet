package org.chelobyte.todolist;

import org.chelobyte.todolist.config.TaskListConfiguration;
import org.chelobyte.todolist.work.Choice;
import org.chelobyte.todolist.work.Printer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.NoSuchElementException;

public class Executor {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskListConfiguration.class);

        Choice choice = context.getBean(Choice.class);
        Printer.printGreetings();

        while (true) {
            try {
                choice.choose();
            } catch (NoSuchElementException e) {
                break;
            }
        }

        context.close();
    }

}
