# Quarkus Build Cache

Image with basic dependencies to build Quarkus and Graalvm images.

## To publish a new image

**Build:**

$ docker build -t docker.pkg.github.com/erickmoreno/quarkus-build-cache/quarkus-build-cache:${TAG}

**Publish:**

$ docker push docker.pkg.github.com/erickmoreno/quarkus-build-cache/quarkus-build-cache:${TAG}
