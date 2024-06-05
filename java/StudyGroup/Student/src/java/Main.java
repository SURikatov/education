package java;
import java.model.Stream;
import java.model.StudyGroup;
import java.controller.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroup group1 = new StudyGroup("Группа 1");
        StudyGroup group2 = new StudyGroup("Группа 2");
        StudyGroup group3 = new StudyGroup("Группа 3");

        Stream potok1 = new Stream(Arrays.asList(group1, group2));
        Stream potok2 = new Stream(Arrays.asList(group3));
        Stream potok3 = new Stream(Arrays.asList(group1, group2, group3));

        List<Stream> potoks = new ArrayList<>(Arrays.asList(potok1, potok2, potok3));

        Controller controller = new Controller();
        controller.sortStreams(potoks);

        for (Stream potok : potoks) {
            System.out.println("Поток с " + potok.getStudyGroups().size() + " группами");
        }
    }
}