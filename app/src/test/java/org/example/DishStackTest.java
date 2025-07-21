package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DishStackTest {

    private DishStack stack;
    private Dish oneDish;
    private Dish twoDish;
    private Dish redDish;
    private Dish blueDish;

    @BeforeEach
    public void setUp() {
        stack = new DishStack();
        oneDish = new Dish("A dish with one fish pattern on it");
        twoDish = new Dish("A dish with two fish patterns on it");
        redDish = new Dish("A dish with a red fish pattern on it");
        blueDish = new Dish("A dish with a blue fish pattern on it");
    }

    @Test
    public void testInitialSize() {
        assertEquals(0, stack.size(), "Stack should be empty initially");
    }

    @Test
    public void testPushAndSize() {
        stack.push(oneDish);
        stack.push(twoDish);
        assertEquals(2, stack.size(), "Stack size should be 2 after two pushes");
    }

    @Test
    public void testPeek() {
        stack.push(redDish);
        stack.push(blueDish);
        Dish peeked = stack.peek();
        assertNotNull(peeked, "Peeked dish should not be null");
        assertEquals("A dish with a blue fish pattern on it", peeked.description);
        assertEquals(2, stack.size(), "Peek should not change the size");
    }

    @Test
    public void testPop() {
        stack.push(oneDish);
        stack.push(twoDish);
        Dish popped = stack.pop();
        assertEquals("A dish with two fish patterns on it", popped.description);
        assertEquals(1, stack.size(), "Stack size should decrease after pop");

        Dish next = stack.pop();
        assertEquals("A dish with one fish pattern on it", next.description);
        assertEquals(0, stack.size(), "Stack should be empty after popping all");
    }

    @Test
    public void testPopFromEmptyStack() {
        Dish result = stack.pop();
        assertNull(result, "Popping from empty stack should return null");
    }

    @Test
    public void testPeekOnEmptyStack() {
        Dish result = stack.peek();
        assertNull(result, "Peeking on empty stack should return null");
    }

    @Test
    public void testClear() {
        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        stack.clear();
        assertEquals(0, stack.size(), "Clear should remove all elements");
        assertNull(stack.peek(), "Peek after clear should return null");
    }
}
