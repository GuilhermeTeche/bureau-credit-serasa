FROM openjdk:11

COPY target/credit-recovery-bridge-*.jar /usr/src/app/credit-recovery-bridge.jar

WORKDIR /usr/src/app

EXPOSE 9292

ENTRYPOINT ["java", "-jar", "credit-recovery-bridge.jar"]


FROM openjdk:11

RUN apk add --update

COPY target/capture-*.jar /usr/src/app/capture.jar

WORKDIR /usr/src/app

EXPOSE 8181

CMD ["java", "-jar", "capture.jar", "--spring.profiles.active=${env}"]