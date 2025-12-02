package task3;

import java.util.*;

public class UniversityExample {

    static void main() {
        Set<String> examPassedNames = new HashSet<>();
        examPassedNames.add("Иванов Иван");
        examPassedNames.add("Практикумова Яна");

        Map<Integer, String> groupNames = new HashMap<>();
        groupNames.put(2020, "2020-ГР1");
        groupNames.put(2021, "2021-ГР0");

        List<String> graduatesClub = new ArrayList<>();

        List<Student> students = new ArrayList<>();
        students.add(new Student("Практикумова", "Яна", "yana@yandex.ru", 2021));
        students.add(new Student("Иванов", "Иван", "ivan_ivanov@mail.ru", 2020));
        students.add(new Student("Сергеев", "Дмитрий", "iamdmitry@gmail.com", 2021));
        List<Student> graduatedStudents = students.stream()
                .filter(student -> examPassedNames.contains(student.surname + " " + student.name))
                .peek(student -> student.groupName = groupNames.get(student.entranceYear))
                .peek(student -> graduatesClub.add(student.email))
                .toList();
        for (Student student : graduatedStudents) {
            System.out.println(student);
        }

        for (String email: graduatesClub) {
            System.out.println(email);
        }

    }
}