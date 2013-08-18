package com.github.groovyosgi.bundle.sample

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*
import static org.junit.matchers.JUnitMatchers.*

import org.junit.Test

class GroovyActivatorTest {

    @Test
    public void test() {
        assertThat GroovyActivator.context, is(notNullValue())
    }
}
