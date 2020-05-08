import models.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.nio.file.Paths.*;

public class App {

   static Function<String,  Person> getPerson = l -> lineToPerson(l);

    public static void main(String[] args) {

        Path path = Path.of("files\\data.csv");

        try (BufferedReader reader = Files.newBufferedReader(path)){

                final Stream<String> lines = reader.lines();
                lines.filter( l -> !l.startsWith("#"))
                        .map(getPerson)
                        .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Person lineToPerson(String line) {
        String[] l = line.split(";");

        final String name = l[0];
        final String lastName = l[1];
        final int age =  Integer.parseInt(l[2]);
        final String physicalAddress = l[3];

        return new Person(name, lastName, age, physicalAddress);
    }
}
