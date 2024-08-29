FROM gradle AS build
WORKDIR /app
COPY build.gradle /app
COPY . /app
RUN gradle clean build

FROM openjdk:21
COPY --from=build /app/build/libs/*SNAPSHOT.jar auth-module.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/auth-module.jar"]