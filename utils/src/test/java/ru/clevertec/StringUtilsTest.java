package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    @Test
    void isPositiveNumberWithPositiveNumberReturnsTrue() {
        assertTrue(StringUtils.isPositiveNumber("9"), "isPositiveNumber should return 'true'");
    }
    @Test
    void isPositiveNumberWithPositiveDNumberReturnsTrue() {
        assertTrue(StringUtils.isPositiveNumber("9.3"), "isPositiveNumber should return 'true'");
    }
    @Test
    void isPositiveNumberWithNegativeNumberReturnsFalse() {
        assertFalse(StringUtils.isPositiveNumber("-9"), "isPositiveNumber should return 'false'");
    }
    @Test
    void isPositiveNumberWithNotNumberReturnsFalse() {
        assertFalse(StringUtils.isPositiveNumber("nine"), "isPositiveNumber should return 'false'");
    }
    @Test
    void isPositiveNumberWithZeroReturnsFalse() {
        assertFalse(StringUtils.isPositiveNumber("0"), "isPositiveNumber should return 'false'");
    }
}
