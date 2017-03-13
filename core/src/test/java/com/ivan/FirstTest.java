package com.ivan;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FirstTest {

    @Test
    public void first() {
        assertThat(1, is(1));
    }
}
