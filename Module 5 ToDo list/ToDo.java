import java.util.Date;
import java.text.SimpleDateFormat;

class ToDo {
    String task_name;
    String task_description;
    Date date;
    String status;
    
    ToDo(String tn, String td, String d, String st) {
        task_name = tn;
        task_description = td;
        date = d;
        status = st;
    }

    public String getTaskName() {
        return task_name;
    }

    public String getTaskDescription() {
        return task_description;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }
    
    public void setTaskName(String tname) {
        task_name = tname;
    }

    public void setTaskDescription(String tdescription) {
        task_description = tdescription;
    }

    public void setDate(Date d) {
        date = d;
    }

    public void setStatus(String s) {
        status = s;
    }

    public String displayTask() {
        return task_name + " \n" + task_description + " \n" + date + " \n" + status;
    }
}