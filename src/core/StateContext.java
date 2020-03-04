package core;

public class StateContext {
    private State state = new YellowState();

    public void next() {
        System.out.println("Now color " + state.getName());
        state.next(this);
    }

    public void back() {
        System.out.println("Now color " + state.getName());
        state.back(this);
    }

    public void work() {
        System.out.println("Now color " + state.getName());
        state.work(this);
    }

    public void setState(State state) {
        System.out.println("Changing color to " + state.getName());
        this.state = state;
    }

    public State getState() {
        return state;
    }

}
