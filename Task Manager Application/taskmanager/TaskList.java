package taskmanager;

import java.lang.String;
import java.util.Date;
import java.time.LocalDate;
import java.util.Vector;
import javax.swing.JPanel;


import taskmanager.Task;

public class TaskList{
    // protected Vector<Task> listOfTasks;
    public Vector<Task>listOfTasks;

    //constructor
    public TaskList() {
        listOfTasks = new Vector<Task>();
    }

    //adding task
    public void addTask(int priority, String title, LocalDate begin, LocalDate end) {
        Task newTask = new Task(priority, title, begin, end);
        listOfTasks.add(newTask);
    }
    //removing task
    public void removeTask(Task t) {
        if (listOfTasks.contains(t)) {
            listOfTasks.remove(listOfTasks.indexOf(t));
        }
    }

    public Vector<Task> getListofTasks(){
        return listOfTasks;
    }

    

}//end of class


