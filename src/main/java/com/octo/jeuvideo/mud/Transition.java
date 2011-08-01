package com.octo.jeuvideo.mud;

public class Transition {
    String message;

    public Transition(String message) {
        this.message = message;
    }

    public String decrire() {
        return message;
    }
}
