package com.safari.designPattern.behavioral.memento;

import java.util.List;

public class History {
    private final List<EditorState> states;

    public History(List<EditorState> states) {
        this.states = states;
    }

    public void push(EditorState state) {
        this.states.add(state);
    }

    public EditorState pop() {
        int index = states.size() - 1;
        EditorState state = states.get(index);
        states.remove(index);

        return state;
    }
}
