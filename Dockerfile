FROM nvidia/cuda:10.0-base

RUN apt-get update && \
apt-get install -y --no-install-recommends \
        openjdk-11-jre

COPY target/smirest*.jar /smirest.jar
WORKDIR /
RUN chmod +x /smirest.jar

EXPOSE 8176
CMD ["java","-jar", "/smirest.jar"]