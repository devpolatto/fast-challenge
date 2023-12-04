package com.fastChallenge;

import org.junit.jupiter.api.Test;
import eventAnalyzer.EventAnalyzer;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    void mustReturnGuestsWhoCameToTwoEvents() {
        EventAnalyzer guests= new EventAnalyzer();
        String[] result = guests.AnalyzeGuests();
        String[] expect = {"hbas ies", "alco2 hbas", "pot alco2 hbas"};
        assertArrayEquals(expect, result);
    }
}
