package todo;

public class Task {
    
    private String taskName;
    private String taskPriority;
    private String dueDate;
    
    public Task(String name, String priority, String date) {
        taskName = name;
        taskPriority = priority;
        dueDate = date;
    }
}
