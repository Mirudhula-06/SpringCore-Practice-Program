package org.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("t")
public class Test {

    @Autowired
    @Qualifier("child2")
    Parent parent;
}
