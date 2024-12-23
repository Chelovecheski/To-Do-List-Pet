package org.chelobyte.todolist.engine;

import org.chelobyte.todolist.TaskList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.CoreMatchers.*;

class ChoiceTest {

    private TaskList taskList;
    private Choice choice;

    @BeforeEach
    void setUp() {
        this.taskList = new TaskList();
        this.choice = new Choice(taskList);
    }

    @Test
    void chooseOneWillAddTaskToList() {

        // given
        MockedStatic<Input> input = mockStatic(Input.class);
        given(Input.getString()).willReturn("1");

        // when
        choice.choose();

        input.close();

        // then
        assertThat(taskList.getTaskList().size(), is(1));

    }

    @Test
    void chooseTwoWillRemoveTaskFromList() {

        // given
        MockedStatic<Input> input = mockStatic(Input.class);
        given(Input.getString()).willReturn("2", "1");

        taskList.addTask("Task 1");

        // when
        choice.choose();

        input.close();

        // then
        assertThat(taskList.getTaskList().size(), is(0));

    }

}