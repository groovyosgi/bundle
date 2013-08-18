package com.github.groovyosgi.bundle.sample

import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

class GroovyActivator implements BundleActivator {

    private static BundleContext context

    static BundleContext getContext() {
        return context
    }

    @Override
    public void start(BundleContext context) throws Exception {
        println "Groovy Bundle started - Party on, Wayne."
        this.context = context
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        println "Groovy Bundle stopped - Party on, Garth."
        this.context = null
    }
}
