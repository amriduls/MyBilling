package com.abc.shop.billing;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class MyBillingAppApplication extends Application<MyBillingAppConfiguration> {

    public static void main(final String[] args) throws Exception {
        new MyBillingAppApplication().run(args);
    }

    @Override
    public String getName() {
        return "MyBillingApp";
    }

    @Override
    public void initialize(final Bootstrap<MyBillingAppConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final MyBillingAppConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
