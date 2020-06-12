FROM openjdk:13-alpine

ENV APP_ROOT /app

RUN mkdir ${APP_ROOT}

WORKDIR ${APP_ROOT}

COPY prevengic-api/build/libs/*.jar ${APP_ROOT}/run.jar

EXPOSE 8080

ENTRYPOINT ["java","-Dspring.profiles.active=docker","-Djava.security.egd=file:/dev/./urandom", "-jar", "run.jar"]