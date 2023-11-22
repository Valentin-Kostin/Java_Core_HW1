package ru.gb.lesson1.sample;

import ru.gb.lesson1.regular.Decorator;
import ru.gb.lesson1.regular.OtherClass;

/**
 * https://www.docker.com/products/docker-desktop/
 *  https://hub.docker.com/
 *
 * cd C:\sources\gb\coreV2\group2\lesson1\out\artifacts\lesson1_jar
 * java -jar lesson1.jar
 *
 *
 * cd C:\sources\gb\coreV2\group2\lesson1\src\main
 *
 * javac -sourcepath ./src -d out src/ru/gb/lesson1/sample/Main.java
 * java -classpath /out ru.gb.lesson1.sample.Main
 * javadoc -encoding utf8 -d docs -sourcepath ./java -cp ./out -subpackages ru
 *
 *
 * FROM bellsoft/liberica-openjdk-alpine:16.0.2
 * COPY ./src ./src
 * RUN mkdir ./out
 * RUN javac -sourcepath ./src -d out src/ru/gb/lesson1/sample/Main.java
 * CMD java -classpath ./out ru.gb.lesson1.sample.Main
 *
 *
 * docker build . -t sampleapp:v1
 *
 * docker run --rm sampleapp:v1
 *
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 */
public class Main {
    /**
     * Точка входа в программу. С неё всегда всё начинается.
     *
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        int result = OtherClass.add(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(2, 2);
        System.out.println(Decorator.decorate(result));
    }
}
