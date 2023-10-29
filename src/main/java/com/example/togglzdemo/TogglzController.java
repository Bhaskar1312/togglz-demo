package com.example.togglzdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.manager.FeatureManager;

@RestController
public class TogglzController {
    private FeatureManager featureManager;

    public TogglzController(FeatureManager featureManager) {
        this.featureManager = featureManager;
    }

    @GetMapping("/feature1")
    public String feature1() {
        return "Standard Old Stuff";
    }

    @GetMapping("/awesome")
    public String awesome() {
        if(featureManager.isActive(MyFeatures.FEATURE_ONE)) {
            return "Awesome feature";
        } else {
            return "";
        }
    }

    @GetMapping("/almostready")
    public String almostReady() {
        if(featureManager.isActive(MyFeatures.ALMOST_READY)) {
            return "Almost Ready Feature !!!!";
        } else {
            return "";
        }
    }

}
