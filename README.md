# Quarkus Build Cache

Image with basic dependencies to build Quarkus and Graalvm images.

## To publish a new image

Just run publish script. It creates a tag with current local code, buils a new docker image and publishes its contents on the github registry by default.

```bash
$ ./publish.sh {tag version}
