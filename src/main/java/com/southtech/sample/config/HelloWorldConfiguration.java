package com.southtech.sample.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by hasib on 14-Mar-16.
 */
public class HelloWorldConfiguration extends Configuration {

    @NotEmpty
    private String templateName;

    @NotEmpty
    private String defaultName = "Stranger";

    @JsonProperty
    public String getTemplateName() {
        return templateName;
    }

    @JsonProperty
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }
}
