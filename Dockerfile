FROM nvidia/cuda:10.0-base

RUN apt-get update && \
apt-get install -y --no-install-recommends \
        openjdk-11-jre

COPY target/smirest-0.0.1.jar /smirest-0.0.1.jar
WORKDIR /
RUN chmod +x /smirest-0.0.1.jar

EXPOSE 8176
CMD ["java","-jar", "/smirest-0.0.1.jar"]