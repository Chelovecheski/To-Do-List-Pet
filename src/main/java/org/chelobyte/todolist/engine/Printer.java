package org.chelobyte.todolist.engine;

public class Printer {

    protected static void printNoSuchElementException() {
        System.out.println("Sorry, there's no such option! Try again.\n");
    }

    protected static void printTaskNotFoundException() {
        System.out.println("\nSorry, task with this number does not exist. Try again.\n");
    }

    public static void printGreetings() {
        System.out.println("Hello. Welcome to a To-Do-List.");
    }

    protected static void printMenu() {

        System.out.println("\nChoose one of the following options:\n" +
                "1. Add task\n" +
                "2. Remove task\n" +
                "3. Show tasks\n");

    }

    protected static void printTypeYourTask() {
        System.out.println("\nType your task:");
    }

    protected static void printTaskAdded() {
        System.out.println("\nTask successfully added.");
    }

    protected static void printTypeNumberOfTask() {
        System.out.println("\nType number of task you want to remove from the list:");
    }

    protected static void printTaskRemoved() {
        System.out.println("\nTask successfully removed.");
    }

    protected static void printOneYourTask() {
        System.out.println("\nYour task:");
    }

    protected static void printAllYourTasks() {
        System.out.println("\nAll your tasks:");
    }

    protected static void printListIsEmpty() {
        System.out.println("\nAdd your first task!");
    }


}
