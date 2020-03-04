package com.company;

import core.StateContext;

public class Main {

    public static void main(String[] args) {
        StateContext context = new StateContext();
        context.next();
        context.back();
        context.work();
        context.back();
        context.back();
        context.work();
        context.back();
    }
}
