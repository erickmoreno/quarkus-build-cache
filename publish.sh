#!/bin/sh

if [ "$1" == "" ]; then
    echo "You must pass a tag name (version) to publish this image"
    exit 1
fi

REGISTRY="docker.pkg.github.com"
USER="erickmoreno"
PROJECT="quarkus-build-cache"
IMAGE_NAME="quarkus-build-cache"

IMAGE_PATH="$REGISTRY/$USER/$PROJECT/$IMAGE_NAME"

TAG=$1
echo "Tagging..."
git tag -a "$TAG" -m "Automated tag to create docker image"
git push --tag

echo "Building image..."
docker build -t "$REGISTRY/$USER/$PROJECT/$IMAGE_NAME:$TAG" .

echo "Publishing image..."
docker push "$REGISTRY/$USER/$PROJECT/$IMAGE_NAME:$TAG"
