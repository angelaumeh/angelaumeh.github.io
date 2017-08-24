package com.oreilly.controllers;

import org.junit.Test;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.Assert.*;

public class HelloControllerTest {
    @Test
    public void sayHello() throws Exception {
        HelloController controller = new HelloController();
        String response = controller.sayHello("Dolly", new BindingAwareModelMap());
        assertEquals("hello", response);
    }

}