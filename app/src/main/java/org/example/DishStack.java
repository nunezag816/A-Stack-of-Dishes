public class DishStack {
    private static final int MAX_SIZE = 10;
    private Dish[] stackArray;
    private int top;

    public DishStack() {
        stackArray = new Dish[MAX_SIZE];
        top = -1;
    }

    public void push(Dish dish) {
        if (top >= MAX_SIZE - 1) {
            System.out.println("Stack is full. Cannot push dish: " + dish.description);
        } else {
            stackArray[++top] = dish;
        }
    }

    public Dish pop() {
        if (top < 0) {
            System.out.println("Stack is empty. Nothing to pop.");
            return null;
        } else {
            return stackArray[top--];
        }
    }

    public Dish peek() {
        if (top < 0) {
            System.out.println("Stack is empty. Nothing to peek.");
            return null;
        } else {
            return stackArray[top];
        }
    }

    public int size() {
        return top + 1;
    }

    public void clear() {
        top = -1;
    }
}
