package com.southtech.sample;

import com.southtech.sample.config.HelloWorldConfiguration;
import com.southtech.sample.health.TemplateHealthCheck;
import com.southtech.sample.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by hasib on 14-Mar-16.
 */
public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(HelloWorldConfiguration helloWorldConfiguration, Environment environment) throws Exception {
        final HelloWorldResource resource = new HelloWorldResource(
                helloWorldConfiguration.getTemplateName(),
                helloWorldConfiguration.getDefaultName()
        );

        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(helloWorldConfiguration.getTemplateName());
        environment.healthChecks().register("template", healthCheck);

        environment.jersey().register(resource);

    }
}
