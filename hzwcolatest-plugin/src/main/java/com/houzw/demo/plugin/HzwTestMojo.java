package com.houzw.demo.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name="hzwtest")
public class HzwTestMojo extends AbstractMojo {
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("hzwtest plugin start");
        System.out.println("hzwtest plugin......");
        System.out.println("hzwtest plugin end");
    }
}
