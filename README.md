# Quarkus Build Cache

Image with basic dependencies to build Quarkus and Graalvm images.

## To use this cache image

### Pulling

```bash
docker pull docker.pkg.github.com/erickmoreno/quarkus-build-cache/quarkus-build-cache:latest
```

### Using as build image

```bash
FROM docker.pkg.github.com/erickmoreno/quarkus-build-cache/quarkus-build-cache:latest as build
```

## To publish a new image

Just run publish script. It creates a tag with current local code, builds a new docker image and publishes its contents on the github registry by default.

```bash
$ ./publish.sh {tag version}
