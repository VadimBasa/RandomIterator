import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected PrimitiveIterator.OfInt randomIterator;
    private int min;
    private int max;
//private int diff = max - min;  

    public Randoms(int min, int max) {
        randomIterator = new Random().ints(min, (max + 1)).iterator();
        this.min = min;
        this.max = max;
    }
//@Override
//public <Integer> Iterable(){
//  while (true){
    //int diff = max - min;
//Random random = new Random();
//int i = random.nextInt(diff + 1);
//i += min;
//return (Integer)(i);
//}
//  }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return randomIterator.nextInt();
            }
        };
    }
}