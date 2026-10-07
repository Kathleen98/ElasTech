package lessons.lesson11ArrayListHashMap;

import java.util.ArrayList;
import java.util.List;

public class LessonArrayList {

    public static void main(String[] args) {
        LessonArrayList lesson = new LessonArrayList();
        lesson.addName();
        System.out.println(lesson.names);
        lesson.addMultipleNames();
        System.out.println(lesson.names);
        System.out.println(lesson.names.size());
        System.out.println(lesson.names.contains("Bolota Theodoro Filipi"));
    }

    ArrayList<String> names = new ArrayList<>();

    public  ArrayList<String> addName(){
         names.add("Kathleen");
        return names;
    }

    public ArrayList<String> addMultipleNames(){
        names.addAll(List.of("Bolota Theodoro Filipi", "Mel", "Amora"));
        return names;
    }
}
