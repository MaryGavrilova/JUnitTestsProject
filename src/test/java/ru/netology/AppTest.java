package ru.netology;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static ru.netology.App.*;

class AppTest {
    @BeforeAll
    public static void initSuite() {
        System.out.println("Running tests");

    }

    @AfterAll
    public static void completeSuite() {
        System.out.println("Tests complete");
    }

    @BeforeEach
    public void initTest() {
        System.out.println("Starting new test");

    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete");
    }

    @Test
    public void calculateCircleArea_validArgument_success() {
        String argument = "5";
        double expected = 78.5;
        double result = calculateCircleArea(argument);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void calculateCircleLength_validArgument_success() {
        String argument = "3";
        double expected = 18.84;
        double result = calculateCircleLength(argument);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void calculateCircleArea_notNumberArgument_doesNotThrowsException() {
        String argument = "ваня";
        assertDoesNotThrow(() -> {
            calculateCircleArea(argument);
        });
    }

    @Test
    public void calculateCircleLength_notNumberArgument_doesNotThrowsException() {
        String argument = "";
        assertDoesNotThrow(() -> {
            calculateCircleLength(argument);
        });
    }

    @Test
    public void calculateCircleArea_notPositiveNumber() {
        String argument = "-10";
        double result = calculateCircleArea(argument);
        Assertions.assertEquals(0.0, result);
    }

    @Test
    public void calculateCircleLength_notPositiveNumber() {
        String argument = "-4";
        double result = calculateCircleLength(argument);
        Assertions.assertEquals(0.0, result);
    }

    @Test
    public void addToString_validArgument_success() {
        double argument1 = 4;
        double argument2 = 10;
        String argument = "Маша";
        String expected = "Результаты подсчетов для Маша: Площадь круга: 4.0 Длина окружности: 10.0";
        String result = addToString(argument1, argument2, argument);
        Assertions.assertEquals(expected, result);
    }

}