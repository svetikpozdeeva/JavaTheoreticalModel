package core;

import javax.naming.Name;

public class RedState implements State {

    private static final String NAME = "Red";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void next(StateContext context) {
        context.setState(new YellowState());
    }

    @Override
    public void back(StateContext context) {
        System.out.println("Кнопка дальше не работает");
    }

    @Override
    public void work(StateContext context) {
        context.setState(new BlinkYellowState());
    }
}
