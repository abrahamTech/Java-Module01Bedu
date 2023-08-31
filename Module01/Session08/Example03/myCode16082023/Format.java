package Session08.Example03.myCode16082023;

import java.time.LocalDate;
import java.time.Month;

public class Format {
    public static void main(String[] args) {
        final String NAME = "Beto";
        final int AGE = 26;
        final float AVERAGE = 8.4F;
        final LocalDate BIRTHDATE = LocalDate.of(1996, Month.DECEMBER, 23);

        System.out.println("My name is " + NAME + ", I am " + AGE + " years old and my average is " + AVERAGE);

        System.out.printf("My name is %s, I am %d years old, my average is %.2f and I born on %4$te %4$tB %4$tb %4$tY %4$ty",
                NAME,
                AGE,
                AVERAGE,
                BIRTHDATE);
    }
}
