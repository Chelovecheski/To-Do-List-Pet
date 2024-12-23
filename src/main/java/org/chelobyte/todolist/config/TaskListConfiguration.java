package org.chelobyte.todolist.config;

import org.chelobyte.todolist.TaskList;
import org.chelobyte.todolist.work.Choice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TaskListConfiguration {

    @Bean
    @Scope("singleton")
    protected TaskList taskList() {
        return new TaskList();
    }

    @Bean
    @Scope("singleton")
    protected Choice choice() {
        return new Choice(taskList());
    }

}
