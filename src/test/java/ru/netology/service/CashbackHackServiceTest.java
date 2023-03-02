package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testIfAmountIsZero() {
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testIfAmountIsHundred() {
        int amount = 100;
        int expected = 900;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testIfAmountIsHalfAThousand() {
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testIfAmountIsMin() {
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testIfAmountIsMax() {
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testIfAmountIsBoundary() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testIfAmountIsOverBoundary() {
        int amount = 1100;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }


}