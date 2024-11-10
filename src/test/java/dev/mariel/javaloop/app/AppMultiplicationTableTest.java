package dev.mariel.javaloop.app;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import dev.mariel.javaloop.service.MultiplicationTable;


public class AppMultiplicationTableTest {

    @Test
    public void testMainExecution() {

        assertDoesNotThrow(() -> AppMultiplicationTable.main(new String[0]));

    }

    @Test
    public void testConstructorInitializesWithoutExceptions() {

        assertDoesNotThrow(() -> new AppMultiplicationTable(new MultiplicationTable()));

    }
}
