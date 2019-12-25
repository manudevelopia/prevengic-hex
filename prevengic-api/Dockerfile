FROM openjdk:11-jre-slim

ENV APP_ROOT /app

RUN mkdir ${APP_ROOT}

WORKDIR ${APP_ROOT}

COPY build/libs/*.jar ${APP_ROOT}/run.jar

ENTRYPOINT ["java","-Dspring.profiles.active=dev","-Djava.security.egd=file:/dev/./urandom", "-jar", "run.jar"]