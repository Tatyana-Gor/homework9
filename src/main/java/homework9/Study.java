package homework9;

import java.util.Arrays;
import java.util.List;

import static homework9.Student.*;

public class Study {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Маша",
                        Arrays.asList(
                                new Course("Математика"),
                                new Course("Аналитика"),
                                new Course("Экономика"),
                                new Course("Физика"),
                                new Course("Литература")
                        )),
                new Student("Петя",
                        Arrays.asList(
                                new Course("Экономика"),
                                new Course("Аналитика"),
                                new Course("Математика"),
                                new Course("Литература")
                        )),
                new Student("Света",
                        Arrays.asList(
                                new Course("Экономика"),
                                new Course("Физика"),
                                new Course("Литература")
                        )),
                new Student("Женя",
                        Arrays.asList(
                                new Course("Физика"),
                                new Course("Литератураз")
                        ))
        );
        Course mathLogic = new Course("Аналитика");

        System.out.println("Список уникальных курсов: " + getUniqueCourses(students));
        System.out.println("Список трёх самых любознательных студентов: "
                + getListOfThirstyForKnowledgeStudent(students, 3));
        System.out.println("Список студентов, посещающих курс \"Аналитика\": " +
                getListOfStudentVisitingCourse(students, mathLogic));
    }
}
