package taskmanager;

import java.awt.*;
import javax.swing.*;
import java.lang.String;
import java.time.LocalDate;


public class Task {

    //private variables
    private int priority;
    private String title;
    private LocalDate startDate;
    private LocalDate endDate;
    
    
    //constructor with all parameters
    public Task(int priorityParam, String titleParam, LocalDate begin, LocalDate end) {
        priority = priorityParam;
        title = titleParam;
        startDate = begin;
        endDate = end;
    }

    // setters for editing tasks
    protected void setPriority(int p){
        priority = p;
    }
    protected void setTitle(String t){
        title = t;
    }
    protected void setStartDate(LocalDate d){
        startDate = d;
    }
    protected void setEndDate(LocalDate d){
        endDate = d;
    }

    //getters to acces task information
    protected int getPriority(){
        return priority;
    }
    protected String getTitle(){
        return title;
    }
    protected LocalDate getStartDate(){
        return startDate;
    }
    protected LocalDate getEndDate(){
        return endDate;
    }

    
}//end of class