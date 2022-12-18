package org.Avtosborka;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void MainTest() {
        int answer = Main.sum(2, 2);
        assertEquals(4, answer);
    }

}