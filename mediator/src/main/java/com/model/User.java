package com.model;

import com.inter.IMediator;

public abstract class User {
    protected String name;
    protected IMediator mediator;

    public User(String name, IMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void receive(String message);


}

