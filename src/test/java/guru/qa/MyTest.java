package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyTest {
    public static void main(String[] args) {
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
        }
    }
}