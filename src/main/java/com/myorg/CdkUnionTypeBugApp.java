package com.myorg;

import software.amazon.awscdk.core.App;

import java.util.Arrays;

public class CdkUnionTypeBugApp {
    public static void main(final String[] args) {
        App app = new App();

        new CdkUnionTypeBugStack(app, "CdkUnionTypeBugStack");

        app.synth();
    }
}
