package core;

public interface State {
    String getName();
    void next(StateContext context);
    void back(StateContext context);
    void work(StateContext context);
}
