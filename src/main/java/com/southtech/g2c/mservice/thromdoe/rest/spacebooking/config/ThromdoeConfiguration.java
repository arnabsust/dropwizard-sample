package com.southtech.g2c.mservice.thromdoe.rest.spacebooking.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by hasib on 14-Mar-16.
 */
public class ThromdoeConfiguration extends Configuration {

    @NotEmpty
    private String templateName;

    @NotEmpty
    private String defaultName = "Stranger";

    @NotNull
    @Valid
    private DataSourceFactory dataSourceFactory = new DataSourceFactory();

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

    @JsonProperty("database")
    public DataSourceFactory getDataSourceFactory() {
        return dataSourceFactory;
    }
}
