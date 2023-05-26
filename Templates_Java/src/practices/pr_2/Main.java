package practices.pr_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Human> input = new ArrayList<>();
        input.add(new Human(33, "Alex", "Ivanov", LocalDate.of(1990, 11, 12), 70));
        input.add(new Human(38, "Mike", "Pointer", LocalDate.of(1985, 5, 4), 60));
        input.add(new Human(23, "Vova", "Ivanov", LocalDate.of(2000, 6, 24), 80));
        input.add(new Human(38, "Slava", "Leps", LocalDate.of(2007, 9, 1), 65));
        input.add(new Human(13, "Oleg", "Hagan", LocalDate.of(2010, 7, 6), 45));

        Stream<Human> stream = input.stream();
        stream.sorted(Comparator.comparing(Human::getWeight)).filter(human -> human.getLastName() != "Ivanov")
                .sorted(Comparator.comparing(Human::getAge)).forEach(System.out::println);

        Stream<Human> stream1 = input.stream();
        System.out.println("Произведение всех возрастов: " + stream1.map(x -> x.getAge()).reduce((x, y) -> x * y).get());
    }
}