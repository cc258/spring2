package com.cc.spring.web.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    void sayHello() {
        HelloWorld helloWorld = new HelloWorld();
        Assertions.assertEquals("Hello world",  helloWorld.sayHello("world"));
    }
}