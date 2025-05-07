package com.impl;

import com.annotation.Adapter;

@Adapter(method = "operateCrane")
public class Crane {
    public void operateCrane() {
        System.out.println("Crane is operating");
    }
}
