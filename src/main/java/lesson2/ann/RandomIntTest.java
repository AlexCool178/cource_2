package lesson2.ann;

public class RandomIntTest {

    @RandomInt(max = 10, min = -5)
    private int number;

    public int getNumber() {
        return number;
    }
}
