package org.example.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringUtilsImplTest {
    StringUtils utils = new StringUtilsImpl();

    @Test
    void isPositiveNumber_true() {
        assertTrue(utils.isPositiveNumber("123"));
        assertTrue(utils.isPositiveNumber("1.23"));
        assertTrue(utils.isPositiveNumber("1,23"));
    }

    @Test
    void isPositiveNumber_false() {
        assertFalse(utils.isPositiveNumber("-123"));
        assertFalse(utils.isPositiveNumber("0"));
        assertFalse(utils.isPositiveNumber("abc"));
        assertFalse(utils.isPositiveNumber(""));
        assertFalse(utils.isPositiveNumber("   "));
    }
}