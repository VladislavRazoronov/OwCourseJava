package owcourse.java.homeworks.hw3;

import owcourse.java.homeworks.hw3.task1.Book;
import owcourse.java.homeworks.hw3.task1.Magazine;
import owcourse.java.homeworks.hw3.task1.Printable;
import owcourse.java.homeworks.hw3.task2.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Printing books:");
        List<Printable> toPrint = new ArrayList<>(3);
        toPrint.add(new Book("Big Things",120));
        toPrint.add(new Magazine("Populars","monthly pay"));
        toPrint.add(new Book("Lord of the Tins",520));

        for( Printable el : toPrint){
            el.print();
        }

        System.out.println("Playing music:");

        List<Instrument> orchestra = new ArrayList<>(10);
        orchestra.add(new Guitar(18));
        orchestra.add(new Drum("large"));
        orchestra.add(new Trumpet(3.8));
        orchestra.add(new Piano("electronic"));
        orchestra.add(new Guitar(3));
        orchestra.add(new Trumpet(2.1));
        orchestra.add(new Drum("Small"));
        orchestra.add(new Drum("Huge"));
        orchestra.add(new Trumpet(8));
        orchestra.add(new Guitar(9));

        for(Instrument in: orchestra){
            in.play();
        }
    }
}
