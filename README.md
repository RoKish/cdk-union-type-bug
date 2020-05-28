# Reproducing the issue

```
mvn compile
cdk synth
```

In the output you should be able to see the following:
```
Asset packaging: container-image
Asset interfaces: [@aws-cdk/cloud-assembly-schema.FileAssetMetadataEntry]
```
The interface is `FileAssetMetadataEntry`, while it is supposed to be `ContainerImageAssetMetadataEntry`
