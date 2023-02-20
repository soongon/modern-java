package kr.re.kitri.datetime;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {
    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();
        Thread.sleep(150);
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println(timeElapsed.toMillis());

    }
}
