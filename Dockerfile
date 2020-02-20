#Build Environment
FROM quay.io/quarkus/centos-quarkus-maven:19.3.1-java11
USER root
ADD ./pom.xml /project/pom.xml

# build all dependencies for offline use
RUN mvn dependency:go-offline -B

# copy your other files
COPY ./src ./src

# build for release
RUN mvn package
