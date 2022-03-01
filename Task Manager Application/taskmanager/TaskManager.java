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

    //if the returned task has a priority of -1, it was not found
    public Task getTaskbyTitle(String t){
        Task output = new Task(-1, null, new Date(0), new Date(0));
        for (Task task : listOfTasks) {
            if (task.getTitle() == t) {
                output.setTitle(task.getTitle());
                output.setPriority(task.getPriority());
                output.setStartDate(task.getStartDate());
                output.setEndDate(task.getEndDate());
                return output;
            }
        }
        return output;
    }
    
}//end of class
