package core;

public class BlinkYellowState implements State {

    private static final String NAME = "Blink yellow";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void next(StateContext context) {
        System.out.println("Кнопка не работает");
    }

    @Override
    public void back(StateContext context) {
        System.out.println("Кнопка не работает");
    }

    @Override
    public void work(StateContext context) {
        context.setState(new YellowState());
    }
}
