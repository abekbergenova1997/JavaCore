package lesson9;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    interface Student {
        String getName();
        List<Course> getAllCourses();
    }
    interface Course {}
    List<List<Course>> uniqueCourses(List<Student> students){
        return students.stream()
                .map(Student::getAllCourses)
                .distinct()
                .collect(Collectors.toList());
    }
    List<Student> inquisitiveStudents(List<Student> students){
        return students.stream()
                .sorted(Comparator.comparing(x->x.getAllCourses().size()))
                .limit(3)
                .toList();
    }
    List<Student> listOfStudents(List<Student> students,Course course){
        return students.stream()
                .filter(x -> x.getAllCourses().contains(course))
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
	// write your code here
    }
}
