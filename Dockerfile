FROM openjdk:17-jdk-alpine
EXPOSE 8181
ADD target/docker-githubaction-springboot.jar docker-githubaction-springboot.jar

ENTRYPOINT ["java", "-jar" "/docker-githubaction-springboot"]