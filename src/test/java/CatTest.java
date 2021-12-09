import com.skvortsov.Cat;
import com.skvortsov.DayOfWeek;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CatTest {
    @Test
    void shouldCreateCat() {
        Cat cat = new Cat("black", 10, "persian");
        String color = cat.getColor();
        int weight = cat.getWeight();
        String breed = cat.getBreed();
        Assertions.assertEquals(color, "black");
        Assertions.assertEquals(weight, 10);
        Assertions.assertEquals(breed, "persian");
        Assertions.assertEquals(cat.getColor(), "black");
        Assertions.assertEquals(cat.getWeight(), 10);
        Assertions.assertEquals(cat.getBreed(), "persian");
    }

    @Test
    void equalTest() {
        Cat cat1 = new Cat("black", 10, "persian");
        Cat cat2 = new Cat("white", 8, "persian");
        String breed1 = cat1.getBreed();
        String breed2 = cat2.getBreed();
        Assertions.assertEquals(breed1, breed2);
        Assertions.assertEquals(cat1, cat2);
        Assertions.assertTrue(cat1.equals(cat2));
    }

    @Test
    void notEqualTest() {
        Cat cat1 = new Cat("black", 10, "persian");
        Cat cat2 = new Cat("white", 8, "syrian");
        String breed1 = cat1.getBreed();
        String breed2 = cat2.getBreed();
        Assertions.assertNotEquals(breed1, breed2);
        Assertions.assertNotEquals(cat1, cat2);
        Assertions.assertFalse(cat1.equals(cat2));
    }

    @Test
    void dayTesting() {
        Cat cat1 = new Cat("black", 10, "persian");
        String monday = cat1.whatCatIsDoing(DayOfWeek.MONDAY);
        String tuesday = cat1.whatCatIsDoing(DayOfWeek.TUESDAY);
        String wednesday = cat1.whatCatIsDoing(DayOfWeek.WEDNESDAY);
        String thursday = cat1.whatCatIsDoing(DayOfWeek.THURSDAY);
        String friday = cat1.whatCatIsDoing(DayOfWeek.FRIDAY);
        String saturday = cat1.whatCatIsDoing(DayOfWeek.SATURDAY);
        String sunday = cat1.whatCatIsDoing(DayOfWeek.SUNDAY);
        String another_day = cat1.whatCatIsDoing(DayOfWeek.ANOTHER_DAY);
        Assertions.assertEquals(monday, "Cat is sleeping");
        Assertions.assertEquals(tuesday, "Cat is hunting");
        Assertions.assertEquals(wednesday, "Cat is sleeping");
        Assertions.assertEquals(thursday, "Cat is hunting");
        Assertions.assertEquals(friday, "Cat is sleeping");
        Assertions.assertEquals(saturday, "Cat is hunting");
        Assertions.assertEquals(sunday, "Cat is doing Tigidik");
        Assertions.assertEquals(another_day, "Cat is licking balls");
    }

    @Test
    void dayTesting2() {
        Cat cat1 = new Cat("black", 10, "persian");
        Assertions.assertEquals(cat1.whatCatIsDoing(DayOfWeek.MONDAY), "Cat is sleeping");
        Assertions.assertEquals(cat1.whatCatIsDoing(DayOfWeek.TUESDAY), "Cat is hunting");
        Assertions.assertEquals(cat1.whatCatIsDoing(DayOfWeek.WEDNESDAY), "Cat is sleeping");
        Assertions.assertEquals(cat1.whatCatIsDoing(DayOfWeek.THURSDAY), "Cat is hunting");
        Assertions.assertEquals(cat1.whatCatIsDoing(DayOfWeek.FRIDAY), "Cat is sleeping");
        Assertions.assertEquals(cat1.whatCatIsDoing(DayOfWeek.SATURDAY), "Cat is hunting");
        Assertions.assertEquals(cat1.whatCatIsDoing(DayOfWeek.SUNDAY), "Cat is doing Tigidik");
        Assertions.assertEquals(cat1.whatCatIsDoing(DayOfWeek.ANOTHER_DAY), "Cat is licking balls");
    }

    @Test
    void dayTesting3() {
        Cat cat1 = new Cat("black", 10, "persian");
        Assertions.assertTrue(cat1.whatCatIsDoing(DayOfWeek.MONDAY).equals("Cat is sleeping"));
        Assertions.assertTrue(cat1.whatCatIsDoing(DayOfWeek.TUESDAY).equals("Cat is hunting"));
        Assertions.assertTrue(cat1.whatCatIsDoing(DayOfWeek.WEDNESDAY).equals("Cat is sleeping"));
        Assertions.assertTrue(cat1.whatCatIsDoing(DayOfWeek.THURSDAY).equals("Cat is hunting"));
        Assertions.assertTrue(cat1.whatCatIsDoing(DayOfWeek.FRIDAY).equals("Cat is sleeping"));
        Assertions.assertTrue(cat1.whatCatIsDoing(DayOfWeek.SATURDAY).equals("Cat is hunting"));
        Assertions.assertTrue(cat1.whatCatIsDoing(DayOfWeek.SUNDAY).equals("Cat is doing Tigidik"));
        Assertions.assertTrue(cat1.whatCatIsDoing(DayOfWeek.ANOTHER_DAY).equals("Cat is licking balls"));
    }
}