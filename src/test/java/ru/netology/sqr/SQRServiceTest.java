package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"several squares in a range,200,300,3",
            "all squares in range,90,9900,90",
            "no square in the range,50,99,0",
            "one square in range,1550,1600,1"})
    void squareCounter(String testName, int limitA, int limitB, int expected) {
        SQRService service = new SQRService();

        int actual = service.sqrCounter(limitA, limitB);

        assertEquals(expected, actual);
    }
}
