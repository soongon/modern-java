package kr.re.kitri.stream.majorleague;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class SalaryAnalyzer {
    public static void main(String[] args) throws IOException {

        Path file = Paths.get("/Users/soongonkim/Desktop/modern-java/src/main/resources/Salaries.csv");
        // 2010년 이후 아메리칸 리그의 상위 연봉자 5명의 평균 연봉 구하세요.
        OptionalDouble average = Files.lines(file) // Stream<String>
                .skip(1)
                .map(item -> {
                    String[] s = item.split(",");
                    return new Salary(Integer.parseInt(s[0]),
                    s[1], s[2], s[3], Long.parseLong(s[4]));
                }) // Stream<Salary>
                .filter(item -> item.getYear() >= 2010)
                .filter(item -> item.getLeague().equals("AL"))
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .limit(5) // Stream<Salary> -> Stream<Long> -> LongStream
                .mapToLong(item -> item.getSalary()) // LongStream
                .average();

        double a = average.orElse(0.0);
        System.out.println(a);
    }
}
