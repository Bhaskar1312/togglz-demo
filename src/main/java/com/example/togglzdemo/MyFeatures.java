package com.example.togglzdemo;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;

// http://localhost:8080/togglz-console/index

public enum MyFeatures implements Feature {
    @EnabledByDefault
    @Label("First feature")
    FEATURE_ONE,

    @Label("Almost Ready Feature")
    ALMOST_READY;
}
