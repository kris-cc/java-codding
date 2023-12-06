package dev.cloudconnect.pagesinbook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChallengeTest {
    @Test
    public void test1() {
        assertEquals(false, Challenge.pagesInBook(5));
    }

    @Test
    public void test2() {
        assertEquals(true, Challenge.pagesInBook(4005));
    }

    @Test
    public void test3() {
        assertEquals(true, Challenge.pagesInBook(9453));
    }

    @Test
    public void test4() {
        assertEquals(false, Challenge.pagesInBook(9474));
    }

    @Test
    public void test5() {
        assertEquals(true, Challenge.pagesInBook(125250));
    }

    @Test
    public void test6() {
        assertEquals(true, Challenge.pagesInBook(920046));
    }
}