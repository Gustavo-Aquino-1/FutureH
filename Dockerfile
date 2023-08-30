#FROM openjdk:11.0-jdk as builder
#WORKDIR /app
#COPY . .
#RUN ./mvnw clean package

#FROM openjdk:11.0-jre
#WORKDIR /app
#COPY --from=builder app/target/*.jar app.jar

#EXPOSE 8080
#ENTRYPOINT [ "java","-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar" ]

FROM openjdk:11.0-jdk as builder
WORKDIR /app
COPY . .
RUN ./mvnw clean package

FROM openjdk:11.0-jre
WORKDIR /app
COPY --from=builder app/target/*.jar app.jar

# Adicione o comando wait-for-it.sh aqui
COPY wait-for-it.sh wait-for-it.sh
RUN chmod +x wait-for-it.sh

# Espere pela disponibilidade do serviço de banco de dados
CMD ["./wait-for-it.sh", "db:3306", "--", "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar"]
