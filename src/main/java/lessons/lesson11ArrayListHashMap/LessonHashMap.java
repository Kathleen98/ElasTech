package lessons.lesson11ArrayListHashMap;

import java.util.HashMap;

public class LessonHashMap {
    public static void main(String[] args) {
        LessonHashMap lesson = new LessonHashMap();
        lesson.addAndPrintHash();
    }
    public static HashMap<String , String> emails = new HashMap<>();

    public void addAndPrintHash(){
        emails.put("Ane", "ane@gmail.com");
        System.out.println(emails.get("Ane"));
    }
}
