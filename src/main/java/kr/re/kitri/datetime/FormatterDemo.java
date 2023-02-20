package kr.re.kitri.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatterDemo {

    public static void main(String[] args) {
        DateTimeFormatter customFormatter =
                DateTimeFormatter.ofPattern("yyyy 년 MM 월 dd 일");

        LocalDate today = LocalDate.now();
        String format = customFormatter.format(today);
        System.out.println(format);
    }
}
