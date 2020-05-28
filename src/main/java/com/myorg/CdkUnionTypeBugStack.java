package com.myorg;

import software.amazon.awscdk.core.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;
import software.amazon.awscdk.services.ecr.assets.DockerImageAsset;

import java.util.Collections;

public class CdkUnionTypeBugStack extends Stack {
    public CdkUnionTypeBugStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public CdkUnionTypeBugStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        DockerImageAsset imageAsset = DockerImageAsset.Builder.create(this, "docker-image-asset")
                .directory("docker-context")
                .build();
    }
}
