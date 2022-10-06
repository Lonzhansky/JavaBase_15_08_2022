package com.hillel.lonzhnasky.lessons.lesson16;

import com.hillel.lonzhansky.lessons.lesson16.main.ArrayUtils;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    static int[] array;

    @BeforeAll
    public static void beforeAll() {
        array = new int[] {4, 65, 7, 3};
    }

    @BeforeEach
    public void beforeEach() {
        array = new int[] {4, 65, 7, (int) (Math.random() * 10)};
    }

    @Test
    public void test1() {
        int index = ArrayUtils.getIndexElementInArray(array, 65);
        assertEquals(1, index);
    }

    @Test
    public void test2() {
        int index = ArrayUtils.getIndexElementInArray(new int[] {1, 2, 3, 4}, 232);
        assertEquals(-1, index);
    }

    @Test
    public void test3() {
        int index = ArrayUtils.getIndexElementInArray(new int[] {}, 2);
        assertEquals(-2, index);
    }

    @Test
    public void test4() {
        int index = ArrayUtils.getIndexElementInArray(null, 2);
        assertEquals(-3, index);
    }

    @Test
    public void test5() {
        int index = ArrayUtils.getIndexElementInArray(null, 2);
        assertTrue(index == -3);
    }


}
