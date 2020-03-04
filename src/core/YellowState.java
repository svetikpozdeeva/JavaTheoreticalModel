package core;

public class YellowState implements State {

    private static final String NAME = "Yellow";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void next(StateContext context) {
        context.setState(new GreenState());
    }

    @Override
    public void back(StateContext context) {
        context.setState(new RedState());
    }

    @Override
    public void work(StateContext context) {
        context.setState(new BlinkYellowState());
    }
}
