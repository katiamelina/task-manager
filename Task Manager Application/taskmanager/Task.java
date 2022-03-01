package taskmanager;

import java.lang.String;
import java.util.Date;

public class Task {

    //private variables
    private int priority;
    private String title;
    private Date startDate;
    private Date endDate;
    
    //constructor with all parameters
    public Task(int priorityParam, String titleParam, Date begin, Date end) {
        priority = priorityParam;
        title = titleParam;
        startDate = begin;
        endDate = end;
    }

    // setters for editing tasks
    protected void setPriority(int p){priority = p;}
    protected void setTitle(String t){title = t;}
    protected void setStartDate(Date d){startDate = d;}
    protected void setEndDate(Date d){endDate = d;}

    //getters to acces task information
    protected int getPriority(){return priority;}
    protected String getTitle(){return title;}
    protected Date getStartDate(){return startDate;}
    protected Date getEndDate(){return endDate;}
    
}//end of class