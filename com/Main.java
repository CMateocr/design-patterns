package com;

import com.impl.FirstObserver;
import com.impl.FirstSubject;
import com.impl.SecondObserver;
import com.inter.IObserver;
import com.inter.ISubject;

public class Main {
    public static void main(String[] args) {
        IObserver observer1 = new FirstObserver();
        IObserver observer2 = new SecondObserver();

        ISubject subject1   = new FirstSubject();

        subject1.register( observer1 );
        subject1.register( observer2 );

        FirstSubject sbj = (FirstSubject) subject1;

        sbj.unregister( observer1 );

        sbj.setValue( 2 );
    }
}