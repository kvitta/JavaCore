package Lesson_9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иванов", Arrays.asList(new Course("Психология"), new Course("Биология"))));
        students.add(new Student("Сидоров", Arrays.asList(new Course("Психология"), new Course("Биология"), new Course("География"))));
        students.add(new Student("Петров", Arrays.asList(new Course("География"), new Course("Обществознание"), new Course("Биология"), new Course("Химия"))));
        students.add(new Student("Аверьянов", Arrays.asList( new Course("Биология"), new Course("География"))));
        students.add(new Student("Андреев", Arrays.asList(new Course("Химия"), new Course("Биология"), new Course("География"))));

        System.out.println("Список уникальных курсов:");
        System.out.println(students.stream()
                .map(s -> s.getCourses())
                .flatMap(f -> f.stream())
                .collect(Collectors.toSet()));
        System.out.println("Список самых любознательных студентов(исходя из количесвтва курсов):");
        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(1)// сделала вывод одного самого любознательного, для удобства. Для трех .limit(3)
                .collect(Collectors.toList()));
        System.out.println("Список студентов посещающих выбранный курс (Химия) ");
        Course course = new Course("Химия");
        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }
}
