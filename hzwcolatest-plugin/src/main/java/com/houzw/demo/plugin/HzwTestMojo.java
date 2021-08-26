package com.houzw.demo.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name="hzwtest",defaultPhase= LifecyclePhase.NONE)
public class HzwTestMojo extends AbstractMojo {

    @Parameter(property = "hello", defaultValue = "defaultHello")
    String hello;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("hzwtest plugin start");
        System.out.println("hzwtest sayhello:" + hello);
        System.out.println("hzwtest plugin end");


    }
}
