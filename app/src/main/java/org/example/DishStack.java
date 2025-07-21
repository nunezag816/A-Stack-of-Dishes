import java.util.ArrayList;

public class DishStack {
    private ArrayList<Dish> stack;

    public DishStack() {
        stack = new ArrayList<>();
    }

    public void push(Dish dish) {
        stack.add(dish);
    }

    public Dish pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public Dish peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }

    public void clear() {
        stack.clear();
    }
}
