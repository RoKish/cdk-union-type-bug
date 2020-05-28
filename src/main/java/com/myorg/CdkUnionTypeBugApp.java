package com.myorg;

import software.amazon.awscdk.core.App;
import software.amazon.awscdk.cxapi.CloudAssembly;
import software.amazon.awscdk.cxapi.CloudFormationStackArtifact;
import software.amazon.jsii.JsiiEngine;
import software.amazon.jsii.JsiiObjectRef;

import java.util.Arrays;

public class CdkUnionTypeBugApp {
    public static void main(final String[] args) {
        App app = new App();

        new CdkUnionTypeBugStack(app, "CdkUnionTypeBugStack");

        final CloudAssembly synth = app.synth();
        CloudFormationStackArtifact stack = synth.getStackByName("CdkUnionTypeBugStack");
        for (Object asset : stack.getAssets()) {
            final JsiiEngine instance = JsiiEngine.getInstance();
            final JsiiObjectRef assetRef = instance.nativeToObjRef(asset);
            String packaging = instance.getClient().getPropertyValue(assetRef, "packaging").asText();
            System.out.println("Asset packaging: " + packaging);
            System.out.println("Asset interfaces: " + assetRef.getInterfaces());
        }
    }
}
