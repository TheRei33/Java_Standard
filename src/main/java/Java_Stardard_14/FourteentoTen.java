package Java_Stardard_14;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FourteentoTen {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("김자바", 3, 180)
        };

        Stream<Student> stuStream = Stream.of(stuArr);

        stuStream.sorted(Comparator.comparing(Student::getBan)
                        .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

        stuStream = Stream.of(stuArr);
        IntStream stuScoreStream = stuStream.mapToInt(Student::getTotalScore);

        IntSummaryStatistics start = stuScoreStream.summaryStatistics();
        System.out.println("count = " + start.getCount());
        System.out.println("sum = " + start.getSum());
        System.out.printf("average = %.2f%n" , start.getAverage());
        System.out.println("min = " + start.getMin());
        System.out.println("max = " + start.getMax());
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;
    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
    }

    String getName() { return name;}
    int getBan() { return ban;}
    int getTotalScore() { return totalScore;}

    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }

}

