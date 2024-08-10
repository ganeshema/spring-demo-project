FROM openjdk:22
EXPOSE 9090
ADD target/demo-k8s.jar demo-k8s.jar

LABEL authors="ganeshgc"

ENTRYPOINT ["java","-jar", "/demo-k8s.jar"]