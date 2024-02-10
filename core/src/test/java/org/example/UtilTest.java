package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UtilTest {

    Util util = new Util();

    @Test
    void isAllPositiveNumbers_true() {
        assertTrue(util.isAllPositiveNumbers("12", "79"));
    }

    @Test
    void isAllPositiveNumbers_false() {
        assertFalse(util.isAllPositiveNumbers("12", "-79"));
        assertFalse(util.isAllPositiveNumbers("-12", "79"));
        assertFalse(util.isAllPositiveNumbers("-12", "-79"));
        assertFalse(util.isAllPositiveNumbers("0", "22"));
    }
}