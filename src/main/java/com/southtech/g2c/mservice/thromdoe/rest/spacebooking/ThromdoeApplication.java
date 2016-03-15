package com.southtech.g2c.mservice.thromdoe.rest.spacebooking;

import com.southtech.g2c.mservice.thromdoe.rest.spacebooking.config.ThromdoeConfiguration;
import com.southtech.g2c.mservice.thromdoe.rest.spacebooking.dao.UserDao;
import com.southtech.g2c.mservice.thromdoe.rest.spacebooking.entity.User;
import com.southtech.g2c.mservice.thromdoe.rest.spacebooking.health.TemplateHealthCheck;
import com.southtech.g2c.mservice.thromdoe.rest.spacebooking.resources.UserResource;
import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by hasib on 14-Mar-16.
 */
public class ThromdoeApplication extends Application<ThromdoeConfiguration> {

    /**
     * Hibernate bundle.
     */
    private final HibernateBundle<ThromdoeConfiguration> hibernateBundle
            = new HibernateBundle<ThromdoeConfiguration>(
            User.class
    ) {

        public DataSourceFactory getDataSourceFactory(
                ThromdoeConfiguration configuration
        ) {
            return configuration.getDataSourceFactory();
        }

    };

    public static void main(String[] args) throws Exception {
        new ThromdoeApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(
            final Bootstrap<ThromdoeConfiguration> bootstrap) {
        bootstrap.addBundle(hibernateBundle);
    }

    @Override
    public void run(ThromdoeConfiguration thromdoeConfiguration, Environment environment) throws Exception {

        //Create User DAO.
        final UserDao userDao
                = new UserDao(hibernateBundle.getSessionFactory());

        environment.jersey().register(new UserResource(userDao));

    }
}
