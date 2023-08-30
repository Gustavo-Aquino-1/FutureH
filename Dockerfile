FROM maven:3.8-jdk-11

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

CMD ["java", "-jar", "target/futureh-0.0.1-SNAPSHOT.jar"]