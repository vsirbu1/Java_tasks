package com.inteship.task.oop;

public interface Message {

    void prepareMessage();
    default void messageConverter(String name){
    }

}
