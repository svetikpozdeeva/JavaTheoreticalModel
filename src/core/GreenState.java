package core;

public class GreenState implements State {

    private static final String NAME = "Green";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void next(StateContext context) {
        System.out.println("Кнопка дальше не работает");
    }

    @Override
    public void back(StateContext context) {
        context.setState(new YellowState());
    }

    @Override
    public void work(StateContext context) {
        context.setState(new BlinkYellowState());
    }
}
