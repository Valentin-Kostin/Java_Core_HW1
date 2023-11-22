FROM bellsoft/liberica-openjdk-alpine:16.0.2
COPY ./src ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out src/ru/gb/lesson1/sample/Main.java
CMD java -classpath ./out ru.gb.lesson1.sample.Main