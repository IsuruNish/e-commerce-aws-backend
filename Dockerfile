FROM gradle AS build
WORKDIR /app
COPY build.gradle /app
COPY . /app
RUN gradle clean build

docker pull public.ecr.aws/docker/library/openjdk:21-oracle
COPY --from=build /app/build/libs/*SNAPSHOT.jar auth-module.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/auth-module.jar"]