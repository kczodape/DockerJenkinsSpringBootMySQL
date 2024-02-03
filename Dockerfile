FROM openjdk:17-jdk-alpine

EXPOSE 8181

ARG JAR_FILE=target/SpringBootMysqlDocker-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar

HEALTHCHECK --interval=30s --timeout=30s --start-period=5s --retries=3 CMD wget -q http://localhost:8181/actuator/health -O /dev/null || exit 1

ENTRYPOINT exec java -jar /app.jar