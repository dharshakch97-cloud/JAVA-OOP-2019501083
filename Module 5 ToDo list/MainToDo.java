import java.util.Date;
class ToDoList {
    ToDo[] myTasks;
    int size;

    ToDoList() {
        myTasks = new ToDo[10];
        size = 0;
    }

    public void addTask(ToDo t) {
        myTasks[size] = t;
        size++;
    }

    public ToDo SearchTask(String taskname) {
        for (int i = 0; i < size; i++) {
            if (myTasks[i].task_name == taskname) {
                return myTasks[i];
            }
        }
        return null;
    }

    public void display_tasks() {
        for (int i = 0; i < size; i++) {
            System.out.println(i+1 + " " + myTasks[i].displayTask());
            // System.out.println("Task name :" + myTasks[i].task_name + 
            //         "\n Task description :" + myTasks[i].task_description +
            //             "\n Due date :" + myTasks[i].date + 
            //             "\n Status :" + myTasks[i].status);
        }
        System.out.println();
    }

    public String removeTask(int tIndex) {

        if (tIndex == 0) {
            return "Cancelled removing Task";
        }

        int i = tIndex - 1;

        for (int j = i + 1; j < size; j++) {
            myTasks[i] = myTasks[j];
            i++;
        }
        myTasks[size] = null;
        size--;
        return "Task removed...... with having name " + myTasks[tIndex - 1].task_name + ". ";
    }

    public String updateTask(int tIndex, String status) {
        if (tIndex == 0) {
            return "Cancelled.";
        }
        myTasks[tIndex - 1].setStatus(status);
        return "task status changed. ";
    }

    public void dispPendingTasks() {

        int p = 0;
        for (int i = 0; i < size; i++) {
            if (!(myTasks[i].getStatus().equals("complete"))) {
                p++;
                System.out.println(myTasks[i].displayTask());
            }
        }
        if (p == 0) {
            System.out.println("No Pending/Incomplete found");
        }
    }

    public void displayTasksOnDate(Date date) {
        int c = 0;
        for (int i = 0; i < size; i++) {
            if (myTasks[i].getDate().equals(date)) {
                c++;
                System.out.println(myTasks[i].displayTask());
            }
        }
        if (c == 0) {
            System.out.println("No tasks found on the given date.");
        }
    }
}

class MainToDo {
    public static void main(String[] args) {
        // ToDo t = new ToDo();
        ToDoList td = new ToDoList();
        
        // td.addTask(t); // adding a task
        // td.display_tasks();
        Scanner scan = new Scanner(System.in);

        boolean f = true;
        do {
            System.out.println("1. Add a task - Add\n 2. Remove a task - Remove\n 3. Update a task - Update\n 4. Display all tasks - Display\n 5. Display pending tasks - DispPending\n 6. Display by Date - DispByDate\n 7. Exit - Ext");
            
            String ch = scan.nextLine(); // input your choice
        
            switch (key) {
                case "Add":
                    System.out.print("Enter the name of task \t : ");
                    String t = scan.nextLine();

                    System.out.print("Enter task description \t : ");
                    String d = scan.nextLine();
                    
                    System.out.print("Enter Due Date(dd/mm/yyyy) \t : ");
                    String d1 = scan.nextLine();
                    Date input = parseDate(d1);

                    if (input != null){
                        System.out.print("Enter the Status \t : ");
                        String s = scan.nextLine();
                        Task toAdd = new Task(t, d, input, s);
                        td.addTask(toAdd);
                    } else {
                        System.out.println("Invalid Date format.");
                    }
                    break;
            
                case "Remove":
                    td.display_tasks();
                    System.out.print("Please enter task number to remove  or 0 to Cancel. ");
                    int taskIndex = Integer.parseInt(scan.nextLine());

                    System.out.println(tm.removeTask(taskIndex));
                    
                    break;

                case "Update":
                    td.display_tasks();
                    System.out.print("Please enter task number to update or 0 to Cancel. ");
                    int taskIndex = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter the new status : ");
                    String status = scan.nextLine();
                    td.updateTask(taskIndex, status);
                    break;

                case "Display":
                    td.display_tasks();
                    break;

                case "DispPending":
                    td.dispPendingTasks();
                    break;

                case "DispByDate":
                    System.out.println("Enter the date (dd/mm/yyyy)");
                    String d1 = new scan.nextLine();
                    Date input2 = parseDate(d2);

                    td.displayTasksOnDate(input2);
                    break;

                case "Ext":
                    f = false;
                    break;
                default:
                    break;
            }
        }while(f);

        scan.close();
    }

    public static Date parseDate(String dString) {

        String[] dates = dString.split("/");
        try {
            Date inputDate = new Date(Integer.parseInt(dates[2]), Integer.parseInt(dates[1]), Integer.parseInt(dates[0]));
            return inputDate;
            
        } catch (Exception e) {
            System.out.println("Invalid Date");
            return null;
        }
        
    }
}
