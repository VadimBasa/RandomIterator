import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }


    public Integer Iterable() {
        int diff = max - min;
        Random random = new Random();
        Integer r = 0;
        if (diff > 0) {
            r = random.nextInt(diff + 1) + min;
        } else {
            System.out.println("Введи корректный интервал случайных чисел max - min > 0");
            return null;
        }
        return r;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return Iterable();
            }
        };
    }
}