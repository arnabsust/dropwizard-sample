package com.southtech.g2c.mservice.thromdoe.rest.spacebooking.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by hasib on 14-Mar-16.
 */
public class TemplateHealthCheck extends HealthCheck {

    private final String template;

    public TemplateHealthCheck(String template) {
        this.template = template;
    }

    @Override
    protected Result check() throws Exception {
        final String saying = String.format(template, "TEST");
        if (!saying.contains("TEST")) {
            return Result.unhealthy("template doesn't include a name");
        }
        return Result.healthy();
    }
}
