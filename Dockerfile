FROM openjdk:8-jdk-alpine
MAINTAINER sitizumarohdf <2041720058@student.polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY Empat.java /app

#compile file java
RUN javac Empat.java

#running java
CMD ["java","Empat"]
