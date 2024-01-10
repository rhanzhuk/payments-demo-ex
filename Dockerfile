######## STABLE VERSION #############
FROM gcr.io/distroless/java:11
WORKDIR /app
COPY target/payment_demo_ex-0.0.1-SNAPSHOT.jar /app/payment_demo_ex-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "payment_demo_ex-0.0.1-SNAPSHOT.jar"]
