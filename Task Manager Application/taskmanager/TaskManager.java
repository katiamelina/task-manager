package taskmanager;

import java.lang.String;
import java.util.Date;
import java.util.Vector;

import taskmanager.Task;

public class TaskManager {
    protected Vector<Task> listOfTasks;

    //constructor
    public TaskManager() {
        listOfTasks = new Vector<Task>();
    }

    //adding task
    public void addTask(int priority, String title, Date begin, Date end) {
        listOfTasks.add(new Task(priority, title, begin, end));
    }
    //removing task
    public void removeTask(Task t) {
        if (listOfTasks.contains(t)) {
            listOfTasks.remove(listOfTasks.indexOf(t));
        }
    }
    
}//end of class
