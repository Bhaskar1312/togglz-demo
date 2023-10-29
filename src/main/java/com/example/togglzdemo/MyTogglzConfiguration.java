package com.example.togglzdemo;

import org.springframework.context.annotation.Configuration;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.user.UserProvider;
import org.togglz.servlet.user.ServletUserProvider;

// @Configuration
public class MyTogglzConfiguration implements TogglzConfig {
    @Override
    public Class<? extends Feature> getFeatureClass() {
        return MyFeatures.class;
    }

    @Override
    public StateRepository getStateRepository() {
        return null;
    }

    @Override
    public UserProvider getUserProvider() {
        return new ServletUserProvider(null);
    }
}
